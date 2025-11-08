package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Trademark: ImageVector
    get() {
        if (_trademark != null) {
            return _trademark!!
        }
        _trademark = ImageVector.Builder(
            name = "Trademark",
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
        moveTo(2f, 12f)
        curveTo(2f, 7.75736f, 2f, 5.63604f, 3.46447f, 4.31802f)
        curveTo(4.92893f, 3f, 7.28596f, 3f, 12f, 3f)
        curveTo(16.714f, 3f, 19.0711f, 3f, 20.5355f, 4.31802f)
        curveTo(22f, 5.63604f, 22f, 7.75736f, 22f, 12f)
        curveTo(22f, 16.2426f, 22f, 18.364f, 20.5355f, 19.682f)
        curveTo(19.0711f, 21f, 16.714f, 21f, 12f, 21f)
        curveTo(7.28596f, 21f, 4.92893f, 21f, 3.46447f, 19.682f)
        curveTo(2f, 18.364f, 2f, 16.2426f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 8.5f)
        lineTo(8f, 8.5f)
        moveTo(10.5f, 8.5f)
        lineTo(8f, 8.5f)
        moveTo(13f, 15.5f)
        verticalLineTo(8.5f)
        lineTo(15.75f, 12.5f)
        lineTo(18.5f, 8.5f)
        verticalLineTo(15.5f)
        moveTo(8f, 8.5f)
        verticalLineTo(15.5f)
        }
        }.build()

        return _trademark!!
    }

private var _trademark: ImageVector? = null
