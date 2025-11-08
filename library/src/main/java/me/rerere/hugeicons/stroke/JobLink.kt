package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.JobLink: ImageVector
    get() {
        if (_jobLink != null) {
            return _jobLink!!
        }
        _jobLink = ImageVector.Builder(
            name = "JobLink",
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
        moveTo(11.0065f, 21.5f)
        horizontalLineTo(9.60546f)
        curveTo(6.02021f, 21.5f, 4.22759f, 21.5f, 3.11379f, 20.365f)
        curveTo(2f, 19.2301f, 2f, 17.4034f, 2f, 13.75f)
        curveTo(2f, 10.0966f, 2f, 8.26992f, 3.11379f, 7.13496f)
        curveTo(4.22759f, 6f, 6.02021f, 6f, 9.60546f, 6f)
        horizontalLineTo(13.4082f)
        curveTo(16.9934f, 6f, 18.7861f, 6f, 19.8999f, 7.13496f)
        curveTo(20.7568f, 8.00819f, 20.9544f, 9.2909f, 21f, 11.5f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 18.5f)
        horizontalLineTo(16f)
        moveTo(16f, 21.5f)
        curveTo(14.3431f, 21.5f, 13f, 20.1569f, 13f, 18.5f)
        curveTo(13f, 16.8431f, 14.3431f, 15.5f, 16f, 15.5f)
        moveTo(19f, 21.5f)
        curveTo(20.6569f, 21.5f, 22f, 20.1569f, 22f, 18.5f)
        curveTo(22f, 16.8431f, 20.6569f, 15.5f, 19f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.9998f, 6f)
        lineTo(15.9004f, 5.69094f)
        curveTo(15.4054f, 4.15089f, 15.1579f, 3.38087f, 14.5686f, 2.94043f)
        curveTo(13.9794f, 2.5f, 13.1967f, 2.5f, 11.6313f, 2.5f)
        horizontalLineTo(11.3682f)
        curveTo(9.8028f, 2.5f, 9.02011f, 2.5f, 8.43087f, 2.94043f)
        curveTo(7.84162f, 3.38087f, 7.59411f, 4.15089f, 7.0991f, 5.69094f)
        lineTo(6.99976f, 6f)
        }
        }.build()

        return _jobLink!!
    }

private var _jobLink: ImageVector? = null
