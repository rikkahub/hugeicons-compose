package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LinkCircle02: ImageVector
    get() {
        if (_linkCircle02 != null) {
            return _linkCircle02!!
        }
        _linkCircle02 = ImageVector.Builder(
            name = "LinkCircle02",
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
        moveTo(11.1188f, 2.99805f)
        curveTo(6.55944f, 3.45084f, 2.99854f, 7.29857f, 2.99854f, 11.9782f)
        curveTo(2.99854f, 16.9624f, 7.03806f, 21.0029f, 12.0211f, 21.0029f)
        curveTo(16.6995f, 21.0029f, 20.5464f, 17.4412f, 20.9991f, 12.8807f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5576f, 3.4943f)
        lineTo(11.0483f, 13.0595f)
        moveTo(20.5576f, 3.4943f)
        curveTo(20.0635f, 2.99954f, 16.7351f, 3.04566f, 16.0315f, 3.05567f)
        moveTo(20.5576f, 3.4943f)
        curveTo(21.0517f, 3.98905f, 21.0056f, 7.32199f, 20.9956f, 8.0266f)
        }
        }.build()

        return _linkCircle02!!
    }

private var _linkCircle02: ImageVector? = null
