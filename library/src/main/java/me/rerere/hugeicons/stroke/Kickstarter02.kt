package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kickstarter02: ImageVector
    get() {
        if (_kickstarter02 != null) {
            return _kickstarter02!!
        }
        _kickstarter02 = ImageVector.Builder(
            name = "Kickstarter02",
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
        moveTo(7f, 7.8f)
        verticalLineTo(16.2f)
        curveTo(7f, 17.1941f, 7.8395f, 18f, 8.87508f, 18f)
        curveTo(9.91065f, 18f, 10.7502f, 17.1941f, 10.7502f, 16.2f)
        lineTo(10.7505f, 13.3411f)
        lineTo(13.5888f, 17.2323f)
        curveTo(14.1828f, 18.0466f, 15.352f, 18.2445f, 16.2003f, 17.6743f)
        curveTo(17.0486f, 17.1041f, 17.2547f, 15.9817f, 16.6607f, 15.1674f)
        lineTo(14.3504f, 12f)
        lineTo(16.6607f, 8.83259f)
        curveTo(17.2547f, 8.01826f, 17.0486f, 6.89588f, 16.2003f, 6.32568f)
        curveTo(15.352f, 5.75548f, 14.1828f, 5.95339f, 13.5888f, 6.76772f)
        lineTo(10.7505f, 10.6589f)
        lineTo(10.7502f, 7.8f)
        curveTo(10.7502f, 6.80589f, 9.91065f, 6f, 8.87508f, 6f)
        curveTo(7.8395f, 6f, 7f, 6.80589f, 7f, 7.8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }
        }.build()

        return _kickstarter02!!
    }

private var _kickstarter02: ImageVector? = null
