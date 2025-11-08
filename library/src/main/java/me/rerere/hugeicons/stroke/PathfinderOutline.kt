package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PathfinderOutline: ImageVector
    get() {
        if (_pathfinderOutline != null) {
            return _pathfinderOutline!!
        }
        _pathfinderOutline = ImageVector.Builder(
            name = "PathfinderOutline",
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
        moveTo(9.02599f, 12.996f)
        curveTo(9.08766f, 11.7402f, 9.26219f, 10.9321f, 9.75623f, 10.3126f)
        curveTo(9.91971f, 10.1076f, 10.1057f, 9.92166f, 10.3107f, 9.75819f)
        curveTo(10.9302f, 9.26415f, 11.7383f, 9.08961f, 12.9941f, 9.02795f)
        moveTo(16.9958f, 9f)
        curveTo(18.8475f, 9.02356f, 19.9094f, 9.14388f, 20.6797f, 9.75819f)
        curveTo(20.8847f, 9.92166f, 21.0706f, 10.1076f, 21.2341f, 10.3126f)
        curveTo(21.998f, 11.2706f, 21.998f, 12.6794f, 21.998f, 15.4971f)
        curveTo(21.998f, 18.3148f, 21.998f, 19.7237f, 21.2341f, 20.6816f)
        curveTo(21.0706f, 20.8866f, 20.8847f, 21.0726f, 20.6797f, 21.2361f)
        curveTo(19.7217f, 22f, 18.3129f, 22f, 15.4952f, 22f)
        curveTo(12.6775f, 22f, 11.2686f, 22f, 10.3107f, 21.2361f)
        curveTo(10.1057f, 21.0726f, 9.91971f, 20.8866f, 9.75623f, 20.6816f)
        curveTo(9.14193f, 19.9113f, 9.02161f, 18.8494f, 8.99805f, 16.9978f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9721f, 11.004f)
        curveTo(14.9104f, 12.2598f, 14.7359f, 13.0679f, 14.2418f, 13.6874f)
        curveTo(14.0783f, 13.8924f, 13.8924f, 14.0783f, 13.6874f, 14.2418f)
        curveTo(13.0679f, 14.7359f, 12.2598f, 14.9104f, 11.004f, 14.9721f)
        moveTo(7.00221f, 15f)
        curveTo(5.15059f, 14.9764f, 4.08869f, 14.8561f, 3.31837f, 14.2418f)
        curveTo(3.11338f, 14.0783f, 2.9274f, 13.8924f, 2.76393f, 13.6874f)
        curveTo(2f, 12.7294f, 2f, 11.3206f, 2f, 8.50287f)
        curveTo(2f, 5.68516f, 2f, 4.2763f, 2.76393f, 3.31837f)
        curveTo(2.9274f, 3.11338f, 3.11338f, 2.9274f, 3.31837f, 2.76393f)
        curveTo(4.2763f, 2f, 5.68516f, 2f, 8.50287f, 2f)
        curveTo(11.3206f, 2f, 12.7294f, 2f, 13.6874f, 2.76393f)
        curveTo(13.8924f, 2.9274f, 14.0783f, 3.11338f, 14.2418f, 3.31837f)
        curveTo(14.8561f, 4.08869f, 14.9764f, 5.15059f, 15f, 7.00221f)
        }
        }.build()

        return _pathfinderOutline!!
    }

private var _pathfinderOutline: ImageVector? = null
