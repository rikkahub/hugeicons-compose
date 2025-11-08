package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArchiveOff03: ImageVector
    get() {
        if (_archiveOff03 != null) {
            return _archiveOff03!!
        }
        _archiveOff03 = ImageVector.Builder(
            name = "ArchiveOff03",
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
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 9f)
        verticalLineTo(16f)
        moveTo(4f, 9f)
        verticalLineTo(16f)
        curveTo(4f, 18.8284f, 4f, 20.2426f, 4.87868f, 21.1213f)
        curveTo(5.75736f, 22f, 7.17157f, 22f, 10f, 22f)
        horizontalLineTo(14f)
        curveTo(16.8284f, 22f, 18.2426f, 22f, 19.1213f, 21.1213f)
        curveTo(19.4634f, 20.7793f, 19.6723f, 20.3561f, 19.7999f, 19.7999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 4f)
        horizontalLineTo(19.5f)
        curveTo(20.4346f, 4f, 20.9019f, 4f, 21.25f, 4.20096f)
        curveTo(21.478f, 4.33261f, 21.6674f, 4.52197f, 21.799f, 4.75f)
        curveTo(22f, 5.09808f, 22f, 5.56538f, 22f, 6.5f)
        curveTo(22f, 7.43462f, 22f, 7.90192f, 21.799f, 8.25f)
        curveTo(21.6674f, 8.47803f, 21.478f, 8.66739f, 21.25f, 8.79904f)
        curveTo(20.9019f, 9f, 20.4346f, 9f, 19.5f, 9f)
        horizontalLineTo(13f)
        moveTo(9f, 9f)
        horizontalLineTo(4.5f)
        curveTo(3.56538f, 9f, 3.09808f, 9f, 2.75f, 8.79904f)
        curveTo(2.52197f, 8.66739f, 2.33261f, 8.47803f, 2.20096f, 8.25f)
        curveTo(2f, 7.90192f, 2f, 7.43462f, 2f, 6.5f)
        curveTo(2f, 5.56538f, 2f, 5.09808f, 2.20096f, 4.75f)
        curveTo(2.33261f, 4.52197f, 2.52197f, 4.33261f, 2.75f, 4.20096f)
        curveTo(3.0296f, 4.03954f, 3.38613f, 4.00778f, 4f, 4.00153f)
        }
        }.build()

        return _archiveOff03!!
    }

private var _archiveOff03: ImageVector? = null
