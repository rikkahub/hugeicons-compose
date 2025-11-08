package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlayStore: ImageVector
    get() {
        if (_playStore != null) {
            return _playStore!!
        }
        _playStore = ImageVector.Builder(
            name = "PlayStore",
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
        moveTo(17.9405f, 12.4311f)
        curveTo(17.7073f, 13.3831f, 16.4665f, 14.0669f, 13.9848f, 15.4344f)
        curveTo(11.2857f, 16.9217f, 9.93612f, 17.6654f, 8.84297f, 17.3789f)
        curveTo(8.47274f, 17.2819f, 8.13174f, 17.1112f, 7.84541f, 16.8797f)
        curveTo(7f, 16.1963f, 7f, 14.7773f, 7f, 11.9394f)
        curveTo(7f, 9.10157f, 7f, 7.68264f, 7.84541f, 6.99915f)
        curveTo(8.13174f, 6.76766f, 8.47274f, 6.59704f, 8.84297f, 6.5f)
        curveTo(9.93612f, 6.21349f, 11.2857f, 6.95715f, 13.9848f, 8.44448f)
        curveTo(16.4665f, 9.81199f, 17.7073f, 10.4957f, 17.9405f, 11.4478f)
        curveTo(18.0198f, 11.7717f, 18.0198f, 12.1072f, 17.9405f, 12.4311f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        lineTo(16f, 9.61432f)
        moveTo(8f, 7f)
        lineTo(16f, 14.3857f)
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

        return _playStore!!
    }

private var _playStore: ImageVector? = null
