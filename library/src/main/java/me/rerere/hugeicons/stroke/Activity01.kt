package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Activity01: ImageVector
    get() {
        if (_activity01 != null) {
            return _activity01!!
        }
        _activity01 = ImageVector.Builder(
            name = "Activity01",
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
        moveTo(4.31802f, 19.682f)
        curveTo(3f, 18.364f, 3f, 16.2426f, 3f, 12f)
        curveTo(3f, 7.75736f, 3f, 5.63604f, 4.31802f, 4.31802f)
        curveTo(5.63604f, 3f, 7.75736f, 3f, 12f, 3f)
        curveTo(16.2426f, 3f, 18.364f, 3f, 19.682f, 4.31802f)
        curveTo(21f, 5.63604f, 21f, 7.75736f, 21f, 12f)
        curveTo(21f, 16.2426f, 21f, 18.364f, 19.682f, 19.682f)
        curveTo(18.364f, 21f, 16.2426f, 21f, 12f, 21f)
        curveTo(7.75736f, 21f, 5.63604f, 21f, 4.31802f, 19.682f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 14f)
        lineTo(9.79289f, 11.2071f)
        curveTo(10.1834f, 10.8166f, 10.8166f, 10.8166f, 11.2071f, 11.2071f)
        lineTo(12.7929f, 12.7929f)
        curveTo(13.1834f, 13.1834f, 13.8166f, 13.1834f, 14.2071f, 12.7929f)
        lineTo(17f, 10f)
        }
        }.build()

        return _activity01!!
    }

private var _activity01: ImageVector? = null
