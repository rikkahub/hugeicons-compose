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
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.6664f, 9.66667f)
        curveTo(19.4373f, 7.89583f, 20.4998f, 4f, 20.4998f, 4f)
        curveTo(20.4998f, 4f, 16.6039f, 5.0625f, 14.8331f, 6.83333f)
        moveTo(17.6664f, 9.66667f)
        lineTo(14.8331f, 6.83333f)
        moveTo(17.6664f, 9.66667f)
        lineTo(16.2498f, 11.7917f)
        moveTo(14.8331f, 6.83333f)
        lineTo(12.7081f, 8.25f)
        moveTo(16.2498f, 11.7917f)
        lineTo(12.7081f, 8.25f)
        moveTo(16.2498f, 11.7917f)
        lineTo(9.87476f, 18.1667f)
        curveTo(9.28795f, 18.7535f, 8.33656f, 18.7535f, 7.74976f, 18.1667f)
        moveTo(12.7081f, 8.25f)
        lineTo(6.33309f, 14.625f)
        curveTo(5.74629f, 15.2118f, 5.74629f, 16.1632f, 6.33309f, 16.75f)
        moveTo(7.74976f, 18.1667f)
        lineTo(6.33309f, 16.75f)
        moveTo(7.74976f, 18.1667f)
        curveTo(8.33656f, 18.7535f, 8.33656f, 19.7049f, 7.74976f, 20.2917f)
        lineTo(7.04142f, 21f)
        lineTo(3.49976f, 17.4583f)
        lineTo(4.20809f, 16.75f)
        curveTo(4.79489f, 16.1632f, 5.74629f, 16.1632f, 6.33309f, 16.75f)
        }
        }.build()

        return _bullet!!
    }

private var _bullet: ImageVector? = null
