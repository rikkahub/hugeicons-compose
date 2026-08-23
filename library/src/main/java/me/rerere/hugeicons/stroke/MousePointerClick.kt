package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MousePointerClick: ImageVector
    get() {
        if (_mousePointerClick != null) {
            return _mousePointerClick!!
        }
        _mousePointerClick = ImageVector.Builder(
            name = "MousePointerClick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.6612f, 8.35811f)
            lineTo(17.6891f, 10.3256f)
            curveTo(20.5891f, 11.4604f, 22.0391f, 12.0277f, 21.991f, 12.9278f)
            curveTo(21.943f, 13.8278f, 20.4297f, 14.2405f, 17.4032f, 15.0659f)
            curveTo(16.5021f, 15.3117f, 16.0515f, 15.4346f, 15.7391f, 15.7469f)
            curveTo(15.4267f, 16.0593f, 15.3039f, 16.5099f, 15.0581f, 17.4111f)
            curveTo(14.2327f, 20.4375f, 13.82f, 21.9508f, 12.92f, 21.9988f)
            curveTo(12.0199f, 22.0469f, 11.4525f, 20.5969f, 10.3178f, 17.6969f)
            lineTo(8.3503f, 12.669f)
            curveTo(7.16223f, 9.63279f, 6.56819f, 8.1147f, 7.33754f, 7.34535f)
            curveTo(8.10688f, 6.57601f, 9.62497f, 7.17004f, 12.6612f, 8.35811f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.99219f, 4f)
            verticalLineTo(2f)
            moveTo(4.99219f, 5f)
            lineTo(3.49219f, 3.5f)
            moveTo(3.99219f, 9f)
            horizontalLineTo(1.99219f)
            moveTo(4.99219f, 13f)
            lineTo(3.49219f, 14.5f)
            moveTo(14.4922f, 3.5f)
            lineTo(12.9922f, 5f)
        }
        }.build()

        return _mousePointerClick!!
    }

private var _mousePointerClick: ImageVector? = null
