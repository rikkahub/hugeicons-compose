package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EngineSlash: ImageVector
    get() {
        if (_engineSlash != null) {
            return _engineSlash!!
        }
        _engineSlash = ImageVector.Builder(
            name = "EngineSlash",
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
        moveTo(10.5f, 8f)
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
        curveTo(21.2794f, 17.9667f, 21.1606f, 17.9854f, 20.9936f, 17.9936f)
        moveTo(17f, 14f)
        horizontalLineTo(19f)
        verticalLineTo(16f)
        moveTo(7.04635f, 8.04635f)
        curveTo(6.37065f, 8.10797f, 5.92008f, 8.25149f, 5.58579f, 8.58579f)
        curveTo(5f, 9.17157f, 5f, 10.1144f, 5f, 12f)
        verticalLineTo(13.8593f)
        curveTo(5f, 14.9072f, 5f, 15.4312f, 5.23665f, 15.8733f)
        curveTo(5.4733f, 16.3155f, 5.90927f, 16.6062f, 6.7812f, 17.1875f)
        lineTo(6.9923f, 17.3282f)
        curveTo(7.49247f, 17.6616f, 7.74255f, 17.8284f, 8.02598f, 17.9142f)
        curveTo(8.30941f, 18f, 8.60998f, 18f, 9.2111f, 18f)
        horizontalLineTo(12f)
        curveTo(13.8856f, 18f, 14.8284f, 18f, 15.4142f, 17.4142f)
        curveTo(15.5858f, 17.2426f, 15.7071f, 17.0404f, 15.7929f, 16.7929f)
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
        moveTo(8f, 5f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 3f)
        lineTo(22f, 23f)
        }
        }.build()

        return _engineSlash!!
    }

private var _engineSlash: ImageVector? = null
