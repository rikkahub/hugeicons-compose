package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TransitionBottom: ImageVector
    get() {
        if (_transitionBottom != null) {
            return _transitionBottom!!
        }
        _transitionBottom = ImageVector.Builder(
            name = "TransitionBottom",
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
        moveTo(18f, 1.99994f)
        curveTo(19.4001f, 1.99994f, 20.1002f, 1.99994f, 20.635f, 2.27242f)
        curveTo(21.1054f, 2.51211f, 21.4878f, 2.89456f, 21.7275f, 3.36496f)
        curveTo(22f, 3.89974f, 22f, 4.59981f, 22f, 5.99994f)
        curveTo(22f, 7.40007f, 22f, 8.10014f, 21.7275f, 8.63492f)
        curveTo(21.4878f, 9.10532f, 21.1054f, 9.48777f, 20.635f, 9.72746f)
        curveTo(20.1002f, 9.99994f, 19.4001f, 9.99994f, 18f, 9.99994f)
        lineTo(6f, 9.99994f)
        curveTo(4.59987f, 9.99994f, 3.8998f, 9.99994f, 3.36502f, 9.72746f)
        curveTo(2.89462f, 9.48777f, 2.51217f, 9.10532f, 2.27248f, 8.63492f)
        curveTo(2f, 8.10014f, 2f, 7.40007f, 2f, 5.99994f)
        curveTo(2f, 4.59981f, 2f, 3.89974f, 2.27248f, 3.36496f)
        curveTo(2.51217f, 2.89456f, 2.89462f, 2.51211f, 3.36502f, 2.27242f)
        curveTo(3.8998f, 1.99994f, 4.59987f, 1.99994f, 6f, 1.99994f)
        lineTo(18f, 1.99994f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17.9999f)
        lineTo(12f, 9.99994f)
        moveTo(12f, 17.9999f)
        curveTo(11.2998f, 17.9999f, 9.99153f, 16.0056f, 9.5f, 15.4999f)
        moveTo(12f, 17.9999f)
        curveTo(12.7002f, 17.9999f, 14.0085f, 16.0056f, 14.5f, 15.4999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 15.9999f)
        curveTo(2f, 18.3388f, 2f, 19.5083f, 2.53646f, 20.3621f)
        curveTo(2.81621f, 20.8073f, 3.19267f, 21.1837f, 3.63789f, 21.4635f)
        curveTo(4.49167f, 21.9999f, 5.66111f, 21.9999f, 8f, 21.9999f)
        lineTo(16f, 21.9999f)
        curveTo(18.3389f, 21.9999f, 19.5083f, 21.9999f, 20.3621f, 21.4635f)
        curveTo(20.8073f, 21.1837f, 21.1838f, 20.8073f, 21.4635f, 20.3621f)
        curveTo(22f, 19.5083f, 22f, 18.3388f, 22f, 15.9999f)
        }
        }.build()

        return _transitionBottom!!
    }

private var _transitionBottom: ImageVector? = null
