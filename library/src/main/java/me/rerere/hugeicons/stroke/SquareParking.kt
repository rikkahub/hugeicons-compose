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

val HugeIcons.SquareParking: ImageVector
    get() {
        if (_squareParking != null) {
            return _squareParking!!
        }
        _squareParking = ImageVector.Builder(
            name = "SquareParking",
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
            moveTo(8.99219f, 13f)
            verticalLineTo(8.4f)
            curveTo(8.99219f, 8.02774f, 8.99219f, 7.84162f, 9.04113f, 7.69098f)
            curveTo(9.14005f, 7.38655f, 9.37873f, 7.14786f, 9.68317f, 7.04894f)
            curveTo(9.8338f, 7f, 10.0199f, 7f, 10.3922f, 7f)
            horizontalLineTo(12.9922f)
            curveTo(14.649f, 7f, 15.9922f, 8.34315f, 15.9922f, 10f)
            curveTo(15.9922f, 11.6569f, 14.649f, 13f, 12.9922f, 13f)
            horizontalLineTo(8.99219f)
            close()
            moveTo(8.99219f, 13f)
            verticalLineTo(18f)
        }
        }.build()

        return _squareParking!!
    }

private var _squareParking: ImageVector? = null
