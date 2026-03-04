package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PillBottle: ImageVector
    get() {
        if (_pillBottle != null) {
            return _pillBottle!!
        }
        _pillBottle = ImageVector.Builder(
            name = "PillBottle",
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
        moveTo(6.5f, 2f)
        horizontalLineTo(17.5f)
        curveTo(18.4346f, 2f, 18.9019f, 2f, 19.25f, 2.20096f)
        curveTo(19.478f, 2.33261f, 19.6674f, 2.52197f, 19.799f, 2.75f)
        curveTo(20f, 3.09808f, 20f, 3.56538f, 20f, 4.5f)
        curveTo(20f, 5.43462f, 20f, 5.90192f, 19.799f, 6.25f)
        curveTo(19.6674f, 6.47803f, 19.478f, 6.66739f, 19.25f, 6.79904f)
        curveTo(18.9019f, 7f, 18.4346f, 7f, 17.5f, 7f)
        horizontalLineTo(6.5f)
        curveTo(5.56538f, 7f, 5.09808f, 7f, 4.75f, 6.79904f)
        curveTo(4.52197f, 6.66739f, 4.33261f, 6.47803f, 4.20096f, 6.25f)
        curveTo(4f, 5.90192f, 4f, 5.43462f, 4f, 4.5f)
        curveTo(4f, 3.56538f, 4f, 3.09808f, 4.20096f, 2.75f)
        curveTo(4.33261f, 2.52197f, 4.52197f, 2.33261f, 4.75f, 2.20096f)
        curveTo(5.09808f, 2f, 5.56538f, 2f, 6.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 16f)
        verticalLineTo(7f)
        horizontalLineTo(6f)
        verticalLineTo(16f)
        curveTo(6f, 18.8284f, 6f, 20.2426f, 6.87868f, 21.1213f)
        curveTo(7.75736f, 22f, 9.17157f, 22f, 12f, 22f)
        curveTo(14.8284f, 22f, 16.2426f, 22f, 17.1213f, 21.1213f)
        curveTo(18f, 20.2426f, 18f, 18.8284f, 18f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 11f)
        horizontalLineTo(10f)
        curveTo(10.9428f, 11f, 11.4142f, 11f, 11.7071f, 11.2929f)
        curveTo(12f, 11.5858f, 12f, 12.0572f, 12f, 13f)
        verticalLineTo(15f)
        curveTo(12f, 15.9428f, 12f, 16.4142f, 11.7071f, 16.7071f)
        curveTo(11.4142f, 17f, 10.9428f, 17f, 10f, 17f)
        horizontalLineTo(6f)
        }
        }.build()

        return _pillBottle!!
    }

private var _pillBottle: ImageVector? = null
