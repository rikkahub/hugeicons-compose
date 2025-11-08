package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Doughnut: ImageVector
    get() {
        if (_doughnut != null) {
            return _doughnut!!
        }
        _doughnut = ImageVector.Builder(
            name = "Doughnut",
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
        moveTo(16f, 12f)
        curveTo(16f, 14.2091f, 14.2091f, 16f, 12f, 16f)
        curveTo(9.79086f, 16f, 8f, 14.2091f, 8f, 12f)
        curveTo(8f, 9.79086f, 9.79086f, 8f, 12f, 8f)
        curveTo(14.2091f, 8f, 16f, 9.79086f, 16f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 11.7221f)
        lineTo(21.5602f, 12.3098f)
        curveTo(20.8329f, 13.2817f, 19.8571f, 13.222f, 19.1639f, 12.1633f)
        lineTo(18.95f, 11.8367f)
        curveTo(18.2821f, 10.8167f, 17.3484f, 10.7203f, 16.6269f, 11.5969f)
        lineTo(16f, 12.3585f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 11.7221f)
        lineTo(7.56022f, 12.3098f)
        curveTo(6.83294f, 13.2817f, 5.85712f, 13.222f, 5.1639f, 12.1633f)
        lineTo(4.95001f, 11.8367f)
        curveTo(4.28214f, 10.8167f, 3.34844f, 10.7203f, 2.62686f, 11.5969f)
        lineTo(2f, 12.3585f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 10.8096f, 21.8191f, 9.64788f, 21.4514f, 8.57874f)
        curveTo(21.1518f, 7.70761f, 20.8018f, 7.813f, 19.9222f, 7.92582f)
        curveTo(18.627f, 8.09196f, 17.297f, 7.17566f, 17.0437f, 5.90395f)
        curveTo(16.8672f, 5.01746f, 16.8411f, 5.04121f, 15.9359f, 4.97652f)
        curveTo(15.0631f, 4.91415f, 14.2552f, 4.26218f, 14.0492f, 3.40443f)
        curveTo(13.7224f, 2.04285f, 13.4091f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        }
        }.build()

        return _doughnut!!
    }

private var _doughnut: ImageVector? = null
