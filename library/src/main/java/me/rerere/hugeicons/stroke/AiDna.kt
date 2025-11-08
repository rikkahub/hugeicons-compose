package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiDna: ImageVector
    get() {
        if (_aiDna != null) {
            return _aiDna!!
        }
        _aiDna = ImageVector.Builder(
            name = "AiDna",
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
        moveTo(7.49115f, 14.0016f)
        curveTo(3.00095f, 11.6016f, 3.00095f, 10.4016f, 3.00095f, 10.0016f)
        curveTo(3.00095f, 9.60159f, 3.00095f, 8.40159f, 7.49115f, 6.00159f)
        moveTo(7.49115f, 14.0016f)
        curveTo(3.00095f, 16.4016f, 3.00008f, 17.2016f, 3.00008f, 18.0016f)
        moveTo(7.49115f, 14.0016f)
        curveTo(11.9805f, 11.6021f, 11.9805f, 10.4021f, 11.9805f, 10.0018f)
        curveTo(11.9805f, 9.60159f, 11.9805f, 8.40112f, 7.49115f, 6.00159f)
        moveTo(7.49115f, 6.00159f)
        curveTo(11.9814f, 3.60159f, 11.9814f, 2.80159f, 11.9814f, 2.00159f)
        moveTo(7.49115f, 6.00159f)
        lineTo(5.30789f, 4.74589f)
        curveTo(3.00065f, 3.28308f, 3.00008f, 2.64234f, 3.00008f, 2.00159f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.4119f, 12.0006f)
        verticalLineTo(13.9796f)
        moveTo(10.9249f, 15.501f)
        horizontalLineTo(12.9769f)
        moveTo(18.9479f, 15.501f)
        horizontalLineTo(20.9999f)
        moveTo(18.9479f, 18.4742f)
        horizontalLineTo(20.9999f)
        moveTo(10.9249f, 18.4742f)
        horizontalLineTo(12.9769f)
        moveTo(14.4119f, 20.0198f)
        verticalLineTo(21.9989f)
        moveTo(17.4374f, 20.0198f)
        verticalLineTo(21.9989f)
        moveTo(17.4266f, 12.0006f)
        verticalLineTo(13.9796f)
        moveTo(13.9769f, 19.9682f)
        horizontalLineTo(17.9479f)
        curveTo(18.5002f, 19.9682f, 18.9479f, 19.5205f, 18.9479f, 18.9682f)
        verticalLineTo(14.9796f)
        curveTo(18.9479f, 14.4273f, 18.5002f, 13.9796f, 17.9479f, 13.9796f)
        horizontalLineTo(13.9769f)
        curveTo(13.4246f, 13.9796f, 12.9769f, 14.4273f, 12.9769f, 14.9796f)
        verticalLineTo(18.9682f)
        curveTo(12.9769f, 19.5205f, 13.4246f, 19.9682f, 13.9769f, 19.9682f)
        }
        }.build()

        return _aiDna!!
    }

private var _aiDna: ImageVector? = null
