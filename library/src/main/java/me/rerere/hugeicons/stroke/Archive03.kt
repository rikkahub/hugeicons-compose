package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Archive03: ImageVector
    get() {
        if (_archive03 != null) {
            return _archive03!!
        }
        _archive03 = ImageVector.Builder(
            name = "Archive03",
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
        moveTo(20f, 8f)
        verticalLineTo(15f)
        curveTo(20f, 17.8284f, 20f, 19.2426f, 19.1213f, 20.1213f)
        curveTo(18.2426f, 21f, 16.8284f, 21f, 14f, 21f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 21f, 5.75736f, 21f, 4.87868f, 20.1213f)
        curveTo(4f, 19.2426f, 4f, 17.8284f, 4f, 15f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 3f)
        horizontalLineTo(4.5f)
        curveTo(3.56538f, 3f, 3.09808f, 3f, 2.75f, 3.20096f)
        curveTo(2.52197f, 3.33261f, 2.33261f, 3.52197f, 2.20096f, 3.75f)
        curveTo(2f, 4.09808f, 2f, 4.56538f, 2f, 5.5f)
        curveTo(2f, 6.43462f, 2f, 6.90192f, 2.20096f, 7.25f)
        curveTo(2.33261f, 7.47803f, 2.52197f, 7.66739f, 2.75f, 7.79904f)
        curveTo(3.09808f, 8f, 3.56538f, 8f, 4.5f, 8f)
        horizontalLineTo(19.5f)
        curveTo(20.4346f, 8f, 20.9019f, 8f, 21.25f, 7.79904f)
        curveTo(21.478f, 7.66739f, 21.6674f, 7.47803f, 21.799f, 7.25f)
        curveTo(22f, 6.90192f, 22f, 6.43462f, 22f, 5.5f)
        curveTo(22f, 4.56538f, 22f, 4.09808f, 21.799f, 3.75f)
        curveTo(21.6674f, 3.52197f, 21.478f, 3.33261f, 21.25f, 3.20096f)
        curveTo(20.9019f, 3f, 20.4346f, 3f, 19.5f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11f)
        horizontalLineTo(14f)
        }
        }.build()

        return _archive03!!
    }

private var _archive03: ImageVector? = null
