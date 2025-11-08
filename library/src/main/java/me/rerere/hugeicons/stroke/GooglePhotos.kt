package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GooglePhotos: ImageVector
    get() {
        if (_googlePhotos != null) {
            return _googlePhotos!!
        }
        _googlePhotos = ImageVector.Builder(
            name = "GooglePhotos",
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
        moveTo(12f, 12f)
        curveTo(14.7614f, 12f, 17f, 9.74267f, 17f, 6.95811f)
        curveTo(17f, 4.87018f, 15.7414f, 3.07868f, 13.9475f, 2.31298f)
        curveTo(13.246f, 2.01357f, 12.8953f, 1.86387f, 12.4476f, 2.16297f)
        curveTo(12f, 2.46206f, 12f, 2.95237f, 12f, 3.93298f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        curveTo(9.23858f, 12f, 7f, 14.2573f, 7f, 17.0419f)
        curveTo(7f, 19.1298f, 8.25861f, 20.9213f, 10.0525f, 21.687f)
        curveTo(10.754f, 21.9864f, 11.1047f, 22.1361f, 11.5524f, 21.837f)
        curveTo(12f, 21.5379f, 12f, 21.0476f, 12f, 20.067f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        curveTo(12f, 14.7614f, 14.2573f, 17f, 17.0419f, 17f)
        curveTo(19.1298f, 17f, 20.9213f, 15.7414f, 21.687f, 13.9475f)
        curveTo(21.9864f, 13.246f, 22.1361f, 12.8953f, 21.837f, 12.4476f)
        curveTo(21.5379f, 12f, 21.0476f, 12f, 20.067f, 12f)
        lineTo(12f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        curveTo(12f, 9.23858f, 9.74267f, 7f, 6.95811f, 7f)
        curveTo(4.87018f, 7f, 3.07868f, 8.25861f, 2.31298f, 10.0525f)
        curveTo(2.01357f, 10.754f, 1.86387f, 11.1047f, 2.16297f, 11.5524f)
        curveTo(2.46206f, 12f, 2.95237f, 12f, 3.93298f, 12f)
        horizontalLineTo(12f)
        }
        }.build()

        return _googlePhotos!!
    }

private var _googlePhotos: ImageVector? = null
