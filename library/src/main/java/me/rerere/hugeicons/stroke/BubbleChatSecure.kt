package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleChatSecure: ImageVector
    get() {
        if (_bubbleChatSecure != null) {
            return _bubbleChatSecure!!
        }
        _bubbleChatSecure = ImageVector.Builder(
            name = "BubbleChatSecure",
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
        moveTo(21.5f, 12f)
        curveTo(21.5f, 17.2467f, 17.2467f, 21.5f, 12f, 21.5f)
        curveTo(10.3719f, 21.5f, 8.8394f, 21.0904f, 7.5f, 20.3687f)
        curveTo(5.63177f, 19.362f, 4.37462f, 20.2979f, 3.26592f, 20.4658f)
        curveTo(3.09774f, 20.4913f, 2.93024f, 20.4302f, 2.80997f, 20.31f)
        curveTo(2.62741f, 20.1274f, 2.59266f, 19.8451f, 2.6935f, 19.6074f)
        curveTo(3.12865f, 18.5818f, 3.5282f, 16.6382f, 2.98341f, 15f)
        curveTo(2.6698f, 14.057f, 2.5f, 13.0483f, 2.5f, 12f)
        curveTo(2.5f, 6.75329f, 6.75329f, 2.5f, 12f, 2.5f)
        curveTo(17.2467f, 2.5f, 21.5f, 6.75329f, 21.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.609f, 8.59814f)
        curveTo(13.8731f, 8.22153f, 12.9726f, 8f, 12f, 8f)
        curveTo(11.0274f, 8f, 10.1269f, 8.22153f, 9.39101f, 8.59814f)
        curveTo(9.03013f, 8.78282f, 8.84969f, 8.87517f, 8.67484f, 9.16551f)
        curveTo(8.5f, 9.45586f, 8.5f, 9.73699f, 8.5f, 10.2993f)
        verticalLineTo(11.6948f)
        curveTo(8.5f, 13.9682f, 10.2665f, 15.2321f, 11.2895f, 15.7735f)
        curveTo(11.5748f, 15.9245f, 11.7175f, 16f, 12f, 16f)
        curveTo(12.2825f, 16f, 12.4252f, 15.9245f, 12.7105f, 15.7735f)
        curveTo(13.7335f, 15.2321f, 15.5f, 13.9682f, 15.5f, 11.6948f)
        lineTo(15.5f, 10.2993f)
        curveTo(15.5f, 9.73699f, 15.5f, 9.45586f, 15.3252f, 9.16551f)
        curveTo(15.1503f, 8.87517f, 14.9699f, 8.78282f, 14.609f, 8.59814f)
        }
        }.build()

        return _bubbleChatSecure!!
    }

private var _bubbleChatSecure: ImageVector? = null
