package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LeftToRightListTriangle: ImageVector
    get() {
        if (_leftToRightListTriangle != null) {
            return _leftToRightListTriangle!!
        }
        _leftToRightListTriangle = ImageVector.Builder(
            name = "LeftToRightListTriangle",
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
        moveTo(11f, 5.5f)
        lineTo(21f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.4f, 16.8926f)
        curveTo(6.46667f, 17.607f, 7f, 17.9642f, 7f, 18.5f)
        curveTo(7f, 19.0358f, 6.46667f, 19.393f, 5.4f, 20.1074f)
        curveTo(4.33333f, 20.8218f, 3.8f, 21.1789f, 3.4f, 20.9111f)
        curveTo(3f, 20.6432f, 3f, 19.9288f, 3f, 18.5f)
        curveTo(3f, 17.0712f, 3f, 16.3568f, 3.4f, 16.0889f)
        curveTo(3.8f, 15.8211f, 4.33333f, 16.1782f, 5.4f, 16.8926f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.4f, 3.89263f)
        curveTo(6.46667f, 4.60702f, 7f, 4.96421f, 7f, 5.5f)
        curveTo(7f, 6.03579f, 6.46667f, 6.39298f, 5.4f, 7.10737f)
        curveTo(4.33333f, 7.82176f, 3.8f, 8.17895f, 3.4f, 7.91105f)
        curveTo(3f, 7.64316f, 3f, 6.92877f, 3f, 5.5f)
        curveTo(3f, 4.07123f, 3f, 3.35684f, 3.4f, 3.08895f)
        curveTo(3.8f, 2.82105f, 4.33333f, 3.17824f, 5.4f, 3.89263f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 12f)
        lineTo(21f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 18.5f)
        lineTo(21f, 18.5f)
        }
        }.build()

        return _leftToRightListTriangle!!
    }

private var _leftToRightListTriangle: ImageVector? = null
