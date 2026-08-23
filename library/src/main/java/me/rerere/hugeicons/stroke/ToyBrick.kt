package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ToyBrick: ImageVector
    get() {
        if (_toyBrick != null) {
            return _toyBrick!!
        }
        _toyBrick = ImageVector.Builder(
            name = "ToyBrick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5f, 8f)
            verticalLineTo(6.5f)
            curveTo(5f, 5.56538f, 5f, 5.09808f, 5.20096f, 4.75f)
            curveTo(5.33261f, 4.52197f, 5.52197f, 4.33261f, 5.75f, 4.20096f)
            curveTo(6.09808f, 4f, 6.56538f, 4f, 7.5f, 4f)
            curveTo(8.43462f, 4f, 8.90192f, 4f, 9.25f, 4.20096f)
            curveTo(9.47803f, 4.33261f, 9.66739f, 4.52197f, 9.79904f, 4.75f)
            curveTo(10f, 5.09808f, 10f, 5.56538f, 10f, 6.5f)
            verticalLineTo(8f)
            horizontalLineTo(5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16f, 20f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 20f, 3.75736f, 20f, 2.87868f, 19.1213f)
            curveTo(2f, 18.2426f, 2f, 16.8284f, 2f, 14f)
            curveTo(2f, 11.1716f, 2f, 9.75736f, 2.87868f, 8.87868f)
            curveTo(3.75736f, 8f, 5.17157f, 8f, 8f, 8f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 8f, 20.2426f, 8f, 21.1213f, 8.87868f)
            curveTo(22f, 9.75736f, 22f, 11.1716f, 22f, 14f)
            curveTo(22f, 16.8284f, 22f, 18.2426f, 21.1213f, 19.1213f)
            curveTo(20.2426f, 20f, 18.8284f, 20f, 16f, 20f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14f, 8f)
            verticalLineTo(6.5f)
            curveTo(14f, 5.56538f, 14f, 5.09808f, 14.201f, 4.75f)
            curveTo(14.3326f, 4.52197f, 14.522f, 4.33261f, 14.75f, 4.20096f)
            curveTo(15.0981f, 4f, 15.5654f, 4f, 16.5f, 4f)
            curveTo(17.4346f, 4f, 17.9019f, 4f, 18.25f, 4.20096f)
            curveTo(18.478f, 4.33261f, 18.6674f, 4.52197f, 18.799f, 4.75f)
            curveTo(19f, 5.09808f, 19f, 5.56538f, 19f, 6.5f)
            verticalLineTo(8f)
            horizontalLineTo(14f)
            close()
        }
        }.build()

        return _toyBrick!!
    }

private var _toyBrick: ImageVector? = null
