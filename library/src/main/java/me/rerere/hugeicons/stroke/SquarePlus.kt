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

val HugeIcons.SquarePlus: ImageVector
    get() {
        if (_squarePlus != null) {
            return _squarePlus!!
        }
        _squarePlus = ImageVector.Builder(
            name = "SquarePlus",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.49219f, 12f)
            curveTo(2.49219f, 7.77027f, 2.49219f, 5.6554f, 3.69016f, 4.25276f)
            curveTo(3.86027f, 4.05358f, 4.04577f, 3.86808f, 4.24495f, 3.69797f)
            curveTo(5.64759f, 2.5f, 7.76246f, 2.5f, 11.9922f, 2.5f)
            curveTo(16.2219f, 2.5f, 18.3368f, 2.5f, 19.7394f, 3.69797f)
            curveTo(19.9386f, 3.86808f, 20.1241f, 4.05358f, 20.2942f, 4.25276f)
            curveTo(21.4922f, 5.6554f, 21.4922f, 7.77027f, 21.4922f, 12f)
            curveTo(21.4922f, 16.2297f, 21.4922f, 18.3446f, 20.2942f, 19.7472f)
            curveTo(20.1241f, 19.9464f, 19.9386f, 20.1319f, 19.7394f, 20.302f)
            curveTo(18.3368f, 21.5f, 16.2219f, 21.5f, 11.9922f, 21.5f)
            curveTo(7.76246f, 21.5f, 5.64759f, 21.5f, 4.24495f, 20.302f)
            curveTo(4.04577f, 20.1319f, 3.86027f, 19.9464f, 3.69016f, 19.7472f)
            curveTo(2.49219f, 18.3446f, 2.49219f, 16.2297f, 2.49219f, 12f)
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
            moveTo(11.9922f, 8f)
            verticalLineTo(16f)
            moveTo(15.9922f, 12f)
            horizontalLineTo(7.99219f)
        }
        }.build()

        return _squarePlus!!
    }

private var _squarePlus: ImageVector? = null
