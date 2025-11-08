package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BubbleChatSearch: ImageVector
    get() {
        if (_bubbleChatSearch != null) {
            return _bubbleChatSearch!!
        }
        _bubbleChatSearch = ImageVector.Builder(
            name = "BubbleChatSearch",
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
        moveTo(16f, 15.4998f)
        lineTo(14.375f, 13.8748f)
        moveTo(15f, 11.4998f)
        curveTo(15f, 9.84292f, 13.6569f, 8.49977f, 12f, 8.49977f)
        curveTo(10.3431f, 8.49977f, 9f, 9.84292f, 9f, 11.4998f)
        curveTo(9f, 13.1566f, 10.3431f, 14.4998f, 12f, 14.4998f)
        curveTo(12.8284f, 14.4998f, 13.5784f, 14.164f, 14.1213f, 13.6211f)
        curveTo(14.6642f, 13.0782f, 15f, 12.3282f, 15f, 11.4998f)
        }
        }.build()

        return _bubbleChatSearch!!
    }

private var _bubbleChatSearch: ImageVector? = null
