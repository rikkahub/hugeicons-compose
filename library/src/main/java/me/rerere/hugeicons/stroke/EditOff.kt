package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EditOff: ImageVector
    get() {
        if (_editOff != null) {
            return _editOff!!
        }
        _editOff = ImageVector.Builder(
            name = "EditOff",
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
        moveTo(15f, 15f)
        lineTo(10.7506f, 19.068f)
        curveTo(9.25288f, 20.5543f, 8.504f, 21.2975f, 7.56806f, 21.6741f)
        curveTo(6.63212f, 22.0508f, 5.6032f, 22.0231f, 3.54536f, 21.9676f)
        lineTo(3.26538f, 21.9601f)
        curveTo(2.63891f, 21.9432f, 2.32567f, 21.9348f, 2.14359f, 21.7219f)
        curveTo(1.9615f, 21.509f, 1.98636f, 21.1802f, 2.03608f, 20.5227f)
        lineTo(2.06308f, 20.1657f)
        curveTo(2.20301f, 18.3151f, 2.27297f, 17.3898f, 2.62371f, 16.5581f)
        curveTo(2.97444f, 15.7263f, 3.57944f, 15.051f, 4.78943f, 13.7003f)
        lineTo(9f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 6.67393f)
        lineTo(14.0737f, 3.88545f)
        curveTo(14.8189f, 3.07808f, 15.1915f, 2.6744f, 15.5874f, 2.43893f)
        curveTo(16.5427f, 1.87076f, 17.7191f, 1.85309f, 18.6904f, 2.39232f)
        curveTo(19.0929f, 2.6158f, 19.4769f, 3.00812f, 20.245f, 3.79276f)
        curveTo(21.0131f, 4.5774f, 21.3972f, 4.96972f, 21.6159f, 5.38093f)
        curveTo(22.1438f, 6.37312f, 22.1265f, 7.57479f, 21.5703f, 8.5507f)
        curveTo(21.3398f, 8.95516f, 20.9446f, 9.33578f, 20.1543f, 10.097f)
        lineTo(17.5f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 4f)
        lineTo(20f, 11f)
        }

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
        }.build()

        return _editOff!!
    }

private var _editOff: ImageVector? = null
