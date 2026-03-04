package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bullet: ImageVector
    get() {
        if (_bullet != null) {
            return _bullet!!
        }
        _bullet = ImageVector.Builder(
            name = "Bullet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.6664f, 9.16667f)
        curveTo(19.4373f, 7.39583f, 20.4998f, 3.5f, 20.4998f, 3.5f)
        curveTo(20.4998f, 3.5f, 16.6039f, 4.5625f, 14.8331f, 6.33333f)
        moveTo(17.6664f, 9.16667f)
        lineTo(14.8331f, 6.33333f)
        moveTo(17.6664f, 9.16667f)
        lineTo(16.2498f, 11.2917f)
        moveTo(14.8331f, 6.33333f)
        lineTo(12.7081f, 7.75f)
        moveTo(16.2498f, 11.2917f)
        lineTo(12.7081f, 7.75f)
        moveTo(16.2498f, 11.2917f)
        lineTo(9.87476f, 17.6667f)
        curveTo(9.28795f, 18.2535f, 8.33656f, 18.2535f, 7.74976f, 17.6667f)
        moveTo(12.7081f, 7.75f)
        lineTo(6.33309f, 14.125f)
        curveTo(5.74629f, 14.7118f, 5.74629f, 15.6632f, 6.33309f, 16.25f)
        moveTo(7.74976f, 17.6667f)
        lineTo(6.33309f, 16.25f)
        moveTo(7.74976f, 17.6667f)
        curveTo(8.33656f, 18.2535f, 8.33656f, 19.2049f, 7.74976f, 19.7917f)
        lineTo(7.04142f, 20.5f)
        lineTo(3.49976f, 16.9583f)
        lineTo(4.20809f, 16.25f)
        curveTo(4.79489f, 15.6632f, 5.74629f, 15.6632f, 6.33309f, 16.25f)
        }
        }.build()

        return _bullet!!
    }

private var _bullet: ImageVector? = null
