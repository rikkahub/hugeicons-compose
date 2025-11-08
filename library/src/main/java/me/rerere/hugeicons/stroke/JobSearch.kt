package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.JobSearch: ImageVector
    get() {
        if (_jobSearch != null) {
            return _jobSearch!!
        }
        _jobSearch = ImageVector.Builder(
            name = "JobSearch",
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
        moveTo(11.0065f, 21.0001f)
        horizontalLineTo(9.60546f)
        curveTo(6.02021f, 21.0001f, 4.22759f, 21.0001f, 3.11379f, 19.8652f)
        curveTo(2f, 18.7302f, 2f, 16.9035f, 2f, 13.2501f)
        curveTo(2f, 9.59674f, 2f, 7.77004f, 3.11379f, 6.63508f)
        curveTo(4.22759f, 5.50012f, 6.02021f, 5.50012f, 9.60546f, 5.50012f)
        horizontalLineTo(13.4082f)
        curveTo(16.9934f, 5.50012f, 18.7861f, 5.50012f, 19.8999f, 6.63508f)
        curveTo(20.7568f, 7.50831f, 20.9544f, 8.79102f, 21f, 11.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.0167f, 20.0233f)
        lineTo(21.9998f, 22f)
        moveTo(21.0528f, 17.5265f)
        curveTo(21.0528f, 15.5789f, 19.4739f, 14f, 17.5263f, 14f)
        curveTo(15.5786f, 14f, 13.9998f, 15.5789f, 13.9998f, 17.5265f)
        curveTo(13.9998f, 19.4742f, 15.5786f, 21.0531f, 17.5263f, 21.0531f)
        curveTo(19.4739f, 21.0531f, 21.0528f, 19.4742f, 21.0528f, 17.5265f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9998f, 5.5f)
        lineTo(15.9004f, 5.19094f)
        curveTo(15.4054f, 3.65089f, 15.1579f, 2.88087f, 14.5686f, 2.44043f)
        curveTo(13.9794f, 2f, 13.1967f, 2f, 11.6313f, 2f)
        horizontalLineTo(11.3682f)
        curveTo(9.8028f, 2f, 9.02011f, 2f, 8.43087f, 2.44043f)
        curveTo(7.84162f, 2.88087f, 7.59411f, 3.65089f, 7.0991f, 5.19094f)
        lineTo(6.99976f, 5.5f)
        }
        }.build()

        return _jobSearch!!
    }

private var _jobSearch: ImageVector? = null
