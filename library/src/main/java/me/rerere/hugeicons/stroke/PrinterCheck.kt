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

val HugeIcons.PrinterCheck: ImageVector
    get() {
        if (_printerCheck != null) {
            return _printerCheck!!
        }
        _printerCheck = ImageVector.Builder(
            name = "PrinterCheck",
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
            moveTo(7.35396f, 18f)
            curveTo(5.23084f, 18f, 4.16928f, 18f, 3.41349f, 17.5468f)
            curveTo(2.91953f, 17.2506f, 2.52158f, 16.8271f, 2.26475f, 16.3242f)
            curveTo(1.87179f, 15.5547f, 1.97742f, 14.5373f, 2.18868f, 12.5025f)
            curveTo(2.36503f, 10.8039f, 2.45321f, 9.95455f, 2.88684f, 9.33081f)
            curveTo(3.17153f, 8.92129f, 3.55659f, 8.58564f, 4.00797f, 8.35353f)
            curveTo(4.69548f, 8f, 5.58164f, 8f, 7.35396f, 8f)
            horizontalLineTo(16.646f)
            curveTo(18.4184f, 8f, 19.3045f, 8f, 19.992f, 8.35353f)
            curveTo(20.4434f, 8.58564f, 20.8285f, 8.92129f, 21.1132f, 9.33081f)
            curveTo(21.5468f, 9.95455f, 21.635f, 10.8039f, 21.8113f, 12.5025f)
            curveTo(21.8293f, 12.6755f, 21.8465f, 12.8412f, 21.8627f, 13f)
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
            moveTo(17f, 8f)
            verticalLineTo(6f)
            curveTo(17f, 4.11438f, 17f, 3.17157f, 16.4142f, 2.58579f)
            curveTo(15.8284f, 2f, 14.8856f, 2f, 13f, 2f)
            horizontalLineTo(11f)
            curveTo(9.11438f, 2f, 8.17157f, 2f, 7.58579f, 2.58579f)
            curveTo(7f, 3.17157f, 7f, 4.11438f, 7f, 6f)
            verticalLineTo(8f)
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
            moveTo(14f, 16f)
            lineTo(10.0113f, 16f)
            curveTo(9.32602f, 16f, 8.98337f, 16f, 8.69183f, 16.1089f)
            curveTo(8.30311f, 16.254f, 7.97026f, 16.536f, 7.7462f, 16.9099f)
            curveTo(7.57815f, 17.1904f, 7.49505f, 17.5511f, 7.32884f, 18.2724f)
            curveTo(7.06913f, 19.3995f, 6.93928f, 19.963f, 7.02759f, 20.4149f)
            curveTo(7.14535f, 21.0174f, 7.51237f, 21.5274f, 8.02252f, 21.7974f)
            curveTo(8.40513f, 22f, 8.94052f, 22f, 10.0113f, 22f)
            lineTo(11.9887f, 22f)
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
            moveTo(15f, 20f)
            curveTo(15f, 20f, 16f, 20.5f, 16.75f, 22f)
            curveTo(16.75f, 22f, 19.5294f, 17.8333f, 22f, 17f)
        }
        }.build()

        return _printerCheck!!
    }

private var _printerCheck: ImageVector? = null
