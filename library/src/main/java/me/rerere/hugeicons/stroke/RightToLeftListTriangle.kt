package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RightToLeftListTriangle: ImageVector
    get() {
        if (_rightToLeftListTriangle != null) {
            return _rightToLeftListTriangle!!
        }
        _rightToLeftListTriangle = ImageVector.Builder(
            name = "RightToLeftListTriangle",
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
        moveTo(3f, 5.5f)
        lineTo(13f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.6f, 16.8926f)
        curveTo(17.5333f, 17.607f, 17f, 17.9642f, 17f, 18.5f)
        curveTo(17f, 19.0358f, 17.5333f, 19.393f, 18.6f, 20.1074f)
        curveTo(19.6667f, 20.8218f, 20.2f, 21.1789f, 20.6f, 20.9111f)
        curveTo(21f, 20.6432f, 21f, 19.9288f, 21f, 18.5f)
        curveTo(21f, 17.0712f, 21f, 16.3568f, 20.6f, 16.0889f)
        curveTo(20.2f, 15.8211f, 19.6667f, 16.1782f, 18.6f, 16.8926f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.6f, 3.89263f)
        curveTo(17.5333f, 4.60702f, 17f, 4.96421f, 17f, 5.5f)
        curveTo(17f, 6.03579f, 17.5333f, 6.39298f, 18.6f, 7.10737f)
        curveTo(19.6667f, 7.82176f, 20.2f, 8.17895f, 20.6f, 7.91105f)
        curveTo(21f, 7.64316f, 21f, 6.92877f, 21f, 5.5f)
        curveTo(21f, 4.07123f, 21f, 3.35684f, 20.6f, 3.08895f)
        curveTo(20.2f, 2.82105f, 19.6667f, 3.17824f, 18.6f, 3.89263f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        lineTo(13f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 18.5f)
        lineTo(13f, 18.5f)
        }
        }.build()

        return _rightToLeftListTriangle!!
    }

private var _rightToLeftListTriangle: ImageVector? = null
