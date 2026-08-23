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

val HugeIcons.PenTool03: ImageVector
    get() {
        if (_penTool03 != null) {
            return _penTool03!!
        }
        _penTool03 = ImageVector.Builder(
            name = "PenTool03",
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
            moveTo(9.5f, 14.5f)
            lineTo(2.5f, 21.5f)
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
            moveTo(10.5f, 14.5f)
            curveTo(10.5f, 15.0523f, 10.0523f, 15.5f, 9.5f, 15.5f)
            curveTo(8.94772f, 15.5f, 8.5f, 15.0523f, 8.5f, 14.5f)
            curveTo(8.5f, 13.9477f, 8.94772f, 13.5f, 9.5f, 13.5f)
            curveTo(10.0523f, 13.5f, 10.5f, 13.9477f, 10.5f, 14.5f)
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
            moveTo(18.5f, 12f)
            lineTo(16.7377f, 16.0281f)
            curveTo(15.8875f, 17.9715f, 15.4623f, 18.9432f, 14.6623f, 19.5664f)
            curveTo(13.8622f, 20.1896f, 12.816f, 20.364f, 10.7236f, 20.7127f)
            lineTo(3f, 22f)
            curveTo(2.44772f, 22f, 2f, 21.5523f, 2f, 21f)
            lineTo(3.28727f, 13.2764f)
            curveTo(3.636f, 11.184f, 3.81036f, 10.1378f, 4.43358f, 9.33773f)
            curveTo(5.0568f, 8.53765f, 6.02849f, 8.11254f, 7.97187f, 7.26231f)
            lineTo(12f, 5.5f)
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
            moveTo(18.3787f, 11.8787f)
            lineTo(12.1213f, 5.62132f)
            curveTo(11.7235f, 5.2235f, 11.5f, 4.68393f, 11.5f, 4.12132f)
            curveTo(11.5f, 2.94975f, 12.4497f, 2f, 13.6213f, 2f)
            curveTo(14.1839f, 2f, 14.7235f, 2.2235f, 15.1213f, 2.62132f)
            lineTo(21.3787f, 8.87868f)
            curveTo(21.7765f, 9.2765f, 22f, 9.81607f, 22f, 10.3787f)
            curveTo(22f, 11.5503f, 21.0503f, 12.5f, 19.8787f, 12.5f)
            curveTo(19.3161f, 12.5f, 18.7765f, 12.2765f, 18.3787f, 11.8787f)
            close()
        }
        }.build()

        return _penTool03!!
    }

private var _penTool03: ImageVector? = null
