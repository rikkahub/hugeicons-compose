package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TransitionTop: ImageVector
    get() {
        if (_transitionTop != null) {
            return _transitionTop!!
        }
        _transitionTop = ImageVector.Builder(
            name = "TransitionTop",
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
        moveTo(17.9999f, 21.9999f)
        curveTo(19.4001f, 21.9999f, 20.1001f, 21.9999f, 20.6349f, 21.7275f)
        curveTo(21.1053f, 21.4878f, 21.4878f, 21.1053f, 21.7275f, 20.6349f)
        curveTo(21.9999f, 20.1001f, 21.9999f, 19.4001f, 21.9999f, 17.9999f)
        curveTo(21.9999f, 16.5998f, 21.9999f, 15.8997f, 21.7275f, 15.365f)
        curveTo(21.4878f, 14.8946f, 21.1053f, 14.5121f, 20.6349f, 14.2724f)
        curveTo(20.1001f, 13.9999f, 19.4001f, 13.9999f, 17.9999f, 13.9999f)
        lineTo(5.99994f, 13.9999f)
        curveTo(4.59981f, 13.9999f, 3.89974f, 13.9999f, 3.36496f, 14.2724f)
        curveTo(2.89456f, 14.5121f, 2.51211f, 14.8946f, 2.27242f, 15.365f)
        curveTo(1.99994f, 15.8997f, 1.99994f, 16.5998f, 1.99994f, 17.9999f)
        curveTo(1.99994f, 19.4001f, 1.99994f, 20.1001f, 2.27242f, 20.6349f)
        curveTo(2.51211f, 21.1053f, 2.89456f, 21.4878f, 3.36496f, 21.7275f)
        curveTo(3.89974f, 21.9999f, 4.59981f, 21.9999f, 5.99994f, 21.9999f)
        lineTo(17.9999f, 21.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9999f, 5.99994f)
        lineTo(11.9999f, 13.9999f)
        moveTo(11.9999f, 5.99994f)
        curveTo(11.2997f, 5.99994f, 9.99147f, 7.99424f, 9.49994f, 8.49994f)
        moveTo(11.9999f, 5.99994f)
        curveTo(12.7002f, 5.99994f, 14.0084f, 7.99424f, 14.4999f, 8.49994f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(1.99994f, 7.99994f)
        curveTo(1.99994f, 5.66105f, 1.99994f, 4.49161f, 2.5364f, 3.63783f)
        curveTo(2.81615f, 3.19261f, 3.19261f, 2.81615f, 3.63783f, 2.5364f)
        curveTo(4.49161f, 1.99994f, 5.66105f, 1.99994f, 7.99994f, 1.99994f)
        lineTo(15.9999f, 1.99994f)
        curveTo(18.3388f, 1.99994f, 19.5083f, 1.99994f, 20.3621f, 2.5364f)
        curveTo(20.8073f, 2.81615f, 21.1837f, 3.19261f, 21.4635f, 3.63783f)
        curveTo(21.9999f, 4.49161f, 21.9999f, 5.66105f, 21.9999f, 7.99994f)
        }
        }.build()

        return _transitionTop!!
    }

private var _transitionTop: ImageVector? = null
