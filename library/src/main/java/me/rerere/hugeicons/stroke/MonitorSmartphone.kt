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

val HugeIcons.MonitorSmartphone: ImageVector
    get() {
        if (_monitorSmartphone != null) {
            return _monitorSmartphone!!
        }
        _monitorSmartphone = ImageVector.Builder(
            name = "MonitorSmartphone",
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
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.4924f, 19f)
            lineTo(7.49219f, 19f)
        }

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
            moveTo(9.99219f, 19f)
            verticalLineTo(15f)
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
            moveTo(19.4922f, 12f)
            horizontalLineTo(17.4922f)
            lineTo(17.7422f, 13f)
            horizontalLineTo(19.2422f)
            lineTo(19.4922f, 12f)
            close()
        }

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
            moveTo(14.9922f, 15f)
            curveTo(14.9922f, 13.5858f, 14.9922f, 12.8787f, 15.4315f, 12.4393f)
            curveTo(15.8709f, 12f, 16.578f, 12f, 17.9922f, 12f)
            horizontalLineTo(18.9922f)
            curveTo(20.4064f, 12f, 21.1135f, 12f, 21.5528f, 12.4393f)
            curveTo(21.9922f, 12.8787f, 21.9922f, 13.5858f, 21.9922f, 15f)
            verticalLineTo(19f)
            curveTo(21.9922f, 20.4142f, 21.9922f, 21.1213f, 21.5528f, 21.5607f)
            curveTo(21.1135f, 22f, 20.4064f, 22f, 18.9922f, 22f)
            horizontalLineTo(17.9922f)
            curveTo(16.578f, 22f, 15.8709f, 22f, 15.4315f, 21.5607f)
            curveTo(14.9922f, 21.1213f, 14.9922f, 20.4142f, 14.9922f, 19f)
            verticalLineTo(15f)
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
            moveTo(11.4922f, 15f)
            horizontalLineTo(7.69219f)
            curveTo(5.00518f, 15f, 3.66168f, 15f, 2.82693f, 14.1841f)
            curveTo(1.99219f, 13.3682f, 1.99219f, 12.055f, 1.99219f, 9.42857f)
            verticalLineTo(7.57143f)
            curveTo(1.99219f, 4.94503f, 1.99219f, 3.63183f, 2.82693f, 2.81592f)
            curveTo(3.66168f, 2f, 5.00518f, 2f, 7.69219f, 2f)
            horizontalLineTo(15.2922f)
            curveTo(17.9792f, 2f, 19.3227f, 2f, 20.1574f, 2.81592f)
            curveTo(20.9922f, 3.63183f, 20.9922f, 4.94503f, 20.9922f, 7.57143f)
            verticalLineTo(8.5f)
        }
        }.build()

        return _monitorSmartphone!!
    }

private var _monitorSmartphone: ImageVector? = null
