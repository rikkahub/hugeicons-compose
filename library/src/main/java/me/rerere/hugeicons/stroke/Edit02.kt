package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Edit02: ImageVector
    get() {
        if (_edit02 != null) {
            return _edit02!!
        }
        _edit02 = ImageVector.Builder(
            name = "Edit02",
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
        moveTo(14.0737f, 3.88545f)
        curveTo(14.8189f, 3.07808f, 15.1915f, 2.6744f, 15.5874f, 2.43893f)
        curveTo(16.5427f, 1.87076f, 17.7191f, 1.85309f, 18.6904f, 2.39232f)
        curveTo(19.0929f, 2.6158f, 19.4769f, 3.00812f, 20.245f, 3.79276f)
        curveTo(21.0131f, 4.5774f, 21.3972f, 4.96972f, 21.6159f, 5.38093f)
        curveTo(22.1438f, 6.37312f, 22.1265f, 7.57479f, 21.5703f, 8.5507f)
        curveTo(21.3398f, 8.95516f, 20.9446f, 9.33578f, 20.1543f, 10.097f)
        lineTo(10.7506f, 19.1543f)
        curveTo(9.25288f, 20.5969f, 8.504f, 21.3182f, 7.56806f, 21.6837f)
        curveTo(6.63212f, 22.0493f, 5.6032f, 22.0224f, 3.54536f, 21.9686f)
        lineTo(3.26538f, 21.9613f)
        curveTo(2.63891f, 21.9449f, 2.32567f, 21.9367f, 2.14359f, 21.73f)
        curveTo(1.9615f, 21.5234f, 1.98636f, 21.2043f, 2.03608f, 20.5662f)
        lineTo(2.06308f, 20.2197f)
        curveTo(2.20301f, 18.4235f, 2.27297f, 17.5255f, 2.62371f, 16.7182f)
        curveTo(2.97444f, 15.9109f, 3.57944f, 15.2555f, 4.78943f, 13.9445f)
        lineTo(14.0737f, 3.88545f)
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
        moveTo(14f, 22f)
        lineTo(22f, 22f)
        }
        }.build()

        return _edit02!!
    }

private var _edit02: ImageVector? = null
