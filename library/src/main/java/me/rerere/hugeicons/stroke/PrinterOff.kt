package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PrinterOff: ImageVector
    get() {
        if (_printerOff != null) {
            return _printerOff!!
        }
        _printerOff = ImageVector.Builder(
            name = "PrinterOff",
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
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.35396f, 18f)
        curveTo(5.23084f, 18f, 4.16928f, 18f, 3.41349f, 17.5468f)
        curveTo(2.91953f, 17.2506f, 2.52158f, 16.8271f, 2.26475f, 16.3242f)
        curveTo(1.87179f, 15.5547f, 1.97742f, 14.5373f, 2.18868f, 12.5025f)
        curveTo(2.36503f, 10.8039f, 2.45321f, 9.95455f, 2.88684f, 9.33081f)
        curveTo(3.17153f, 8.92129f, 3.55659f, 8.58564f, 4.00797f, 8.35353f)
        curveTo(4.69548f, 8f, 5.58164f, 8f, 7.35396f, 8f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.2522f, 17f)
        curveTo(21.4443f, 16.7952f, 21.607f, 16.5649f, 21.7348f, 16.3149f)
        curveTo(22.1278f, 15.5464f, 22.0221f, 14.5301f, 21.8109f, 12.4975f)
        curveTo(21.6345f, 10.8007f, 21.5463f, 9.95237f, 21.1127f, 9.32933f)
        curveTo(20.828f, 8.92026f, 20.443f, 8.58499f, 19.9916f, 8.35314f)
        curveTo(19.3041f, 8f, 18.4179f, 8f, 16.6456f, 8f)
        horizontalLineTo(12.5f)
        moveTo(17.0009f, 8.00005f)
        verticalLineTo(6.00918f)
        curveTo(17.0009f, 4.13218f, 17.0009f, 3.19368f, 16.4151f, 2.61057f)
        curveTo(15.8293f, 2.02746f, 14.8865f, 2.02746f, 13.0009f, 2.02746f)
        horizontalLineTo(11.0009f)
        curveTo(9.95416f, 2.02746f, 8.27325f, 1.79145f, 7.5f, 2.70446f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.9887f, 16f)
        lineTo(10.0113f, 16f)
        curveTo(9.32602f, 16f, 8.98337f, 16f, 8.69183f, 16.1089f)
        curveTo(8.30311f, 16.254f, 7.97026f, 16.536f, 7.7462f, 16.9099f)
        curveTo(7.57815f, 17.1904f, 7.49505f, 17.5511f, 7.32884f, 18.2724f)
        curveTo(7.06913f, 19.3995f, 6.93928f, 19.963f, 7.02759f, 20.4149f)
        curveTo(7.14535f, 21.0174f, 7.51237f, 21.5274f, 8.02252f, 21.7974f)
        curveTo(8.40513f, 22f, 8.94052f, 22f, 10.0113f, 22f)
        lineTo(13.9887f, 22f)
        curveTo(15.0595f, 22f, 15.5949f, 22f, 15.9775f, 21.7974f)
        curveTo(16.4876f, 21.5274f, 16.8547f, 21.0174f, 16.9724f, 20.4149f)
        curveTo(17.0607f, 19.963f, 16.9309f, 19.3995f, 16.6712f, 18.2724f)
        curveTo(16.505f, 17.5511f, 16.4218f, 17.1904f, 16.2538f, 16.9099f)
        curveTo(16.0297f, 16.536f, 15.6969f, 16.254f, 15.3082f, 16.1089f)
        curveTo(15.0166f, 16f, 14.674f, 16f, 13.9887f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 12f)
        horizontalLineTo(18.009f)
        }
        }.build()

        return _printerOff!!
    }

private var _printerOff: ImageVector? = null
