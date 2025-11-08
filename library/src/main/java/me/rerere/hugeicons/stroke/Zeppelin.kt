package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Zeppelin: ImageVector
    get() {
        if (_zeppelin != null) {
            return _zeppelin!!
        }
        _zeppelin = ImageVector.Builder(
            name = "Zeppelin",
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
        moveTo(19f, 15.9971f)
        lineTo(18.6938f, 17.3197f)
        curveTo(18.3654f, 18.7379f, 18.2012f, 19.4471f, 17.6938f, 19.7938f)
        curveTo(17.1864f, 20.1406f, 16.5226f, 19.9972f, 15.195f, 19.7105f)
        lineTo(14.4288f, 19.545f)
        curveTo(13.7218f, 19.3924f, 13.3683f, 19.316f, 13.0668f, 19.1179f)
        curveTo(12.7654f, 18.9198f, 12.5402f, 18.6158f, 12.0898f, 18.0079f)
        lineTo(11f, 16.537f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10.9971f)
        curveTo(2f, 13.9971f, 10f, 16.9971f, 15f, 16.9971f)
        curveTo(19f, 16.9971f, 22f, 14.3108f, 22f, 10.9971f)
        curveTo(22f, 7.68336f, 19f, 4.99707f, 15f, 4.99707f)
        curveTo(10f, 4.99707f, 2f, 7.99707f, 2f, 10.9971f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10.9971f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 5.99713f)
        curveTo(6.74487f, 5.15021f, 5.54147f, 3.85496f, 4.36683f, 4.01304f)
        curveTo(4.02163f, 4.05949f, 3.68109f, 4.25046f, 3f, 4.6324f)
        lineTo(4f, 7.99706f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 15.997f)
        curveTo(6.74487f, 16.8439f, 5.54147f, 18.1392f, 4.36683f, 17.9811f)
        curveTo(4.02163f, 17.9347f, 3.68109f, 17.7437f, 3f, 17.3617f)
        lineTo(4f, 13.9971f)
        }
        }.build()

        return _zeppelin!!
    }

private var _zeppelin: ImageVector? = null
