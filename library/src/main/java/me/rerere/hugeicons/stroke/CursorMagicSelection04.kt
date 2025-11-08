package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CursorMagicSelection04: ImageVector
    get() {
        if (_cursorMagicSelection04 != null) {
            return _cursorMagicSelection04!!
        }
        _cursorMagicSelection04 = ImageVector.Builder(
            name = "CursorMagicSelection04",
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
        moveTo(12.669f, 8.35811f)
        lineTo(17.6969f, 10.3256f)
        curveTo(20.5969f, 11.4604f, 22.0469f, 12.0277f, 21.9988f, 12.9278f)
        curveTo(21.9508f, 13.8278f, 20.4375f, 14.2405f, 17.4111f, 15.0659f)
        curveTo(16.5099f, 15.3117f, 16.0593f, 15.4346f, 15.7469f, 15.7469f)
        curveTo(15.4346f, 16.0593f, 15.3117f, 16.5099f, 15.0659f, 17.4111f)
        curveTo(14.2405f, 20.4375f, 13.8278f, 21.9508f, 12.9278f, 21.9988f)
        curveTo(12.0277f, 22.0469f, 11.4604f, 20.5969f, 10.3256f, 17.6969f)
        lineTo(8.35811f, 12.669f)
        curveTo(7.17004f, 9.63279f, 6.57601f, 8.1147f, 7.34535f, 7.34535f)
        curveTo(8.1147f, 6.57601f, 9.63279f, 7.17004f, 12.669f, 8.35811f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 4f)
        verticalLineTo(2f)
        moveTo(5f, 5f)
        lineTo(3.5f, 3.5f)
        moveTo(4f, 9f)
        horizontalLineTo(2f)
        moveTo(5f, 13f)
        lineTo(3.5f, 14.5f)
        moveTo(14.5f, 3.5f)
        lineTo(13f, 5f)
        }
        }.build()

        return _cursorMagicSelection04!!
    }

private var _cursorMagicSelection04: ImageVector? = null
