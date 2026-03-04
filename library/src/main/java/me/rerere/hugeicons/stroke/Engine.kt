package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = ImageVector.Builder(
            name = "Engine",
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
        moveTo(2f, 9f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 13.8593f)
        verticalLineTo(12f)
        curveTo(5f, 10.1144f, 5f, 9.17157f, 5.58579f, 8.58579f)
        curveTo(6.17157f, 8f, 7.11438f, 8f, 9f, 8f)
        horizontalLineTo(13f)
        curveTo(13.9319f, 8f, 14.3978f, 8f, 14.7654f, 8.15224f)
        curveTo(15.2554f, 8.35523f, 15.6448f, 8.74458f, 15.8478f, 9.23463f)
        curveTo(16f, 9.60218f, 16f, 10.0681f, 16f, 11f)
        horizontalLineTo(19f)
        verticalLineTo(9.5f)
        curveTo(19f, 9.03406f, 19f, 8.80109f, 19.0761f, 8.61732f)
        curveTo(19.1776f, 8.37229f, 19.3723f, 8.17761f, 19.6173f, 8.07612f)
        curveTo(19.8011f, 8f, 20.0341f, 8f, 20.5f, 8f)
        curveTo(20.9659f, 8f, 21.1989f, 8f, 21.3827f, 8.07612f)
        curveTo(21.6277f, 8.17761f, 21.8224f, 8.37229f, 21.9239f, 8.61732f)
        curveTo(22f, 8.80109f, 22f, 9.03406f, 22f, 9.5f)
        verticalLineTo(16.5f)
        curveTo(22f, 16.9659f, 22f, 17.1989f, 21.9239f, 17.3827f)
        curveTo(21.8224f, 17.6277f, 21.6277f, 17.8224f, 21.3827f, 17.9239f)
        curveTo(21.1989f, 18f, 20.9659f, 18f, 20.5f, 18f)
        curveTo(20.0341f, 18f, 19.8011f, 18f, 19.6173f, 17.9239f)
        curveTo(19.3723f, 17.8224f, 19.1776f, 17.6277f, 19.0761f, 17.3827f)
        curveTo(19f, 17.1989f, 19f, 16.9659f, 19f, 16.5f)
        verticalLineTo(14f)
        horizontalLineTo(16f)
        curveTo(16f, 15.8856f, 16f, 16.8284f, 15.4142f, 17.4142f)
        curveTo(14.8284f, 18f, 13.8856f, 18f, 12f, 18f)
        horizontalLineTo(9.2111f)
        curveTo(8.60998f, 18f, 8.30941f, 18f, 8.02598f, 17.9142f)
        curveTo(7.74255f, 17.8284f, 7.49247f, 17.6616f, 6.9923f, 17.3282f)
        lineTo(6.7812f, 17.1875f)
        curveTo(5.90927f, 16.6062f, 5.4733f, 16.3155f, 5.23665f, 15.8733f)
        curveTo(5f, 15.4312f, 5f, 14.9072f, 5f, 13.8593f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 8f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 5f)
        horizontalLineTo(14f)
        }
        }.build()

        return _engine!!
    }

private var _engine: ImageVector? = null
