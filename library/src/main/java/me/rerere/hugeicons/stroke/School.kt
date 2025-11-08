package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.School: ImageVector
    get() {
        if (_school != null) {
            return _school!!
        }
        _school = ImageVector.Builder(
            name = "School",
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
        moveTo(7f, 22f)
        verticalLineTo(12.3981f)
        curveTo(7f, 11.3299f, 7f, 10.7958f, 7.24458f, 10.3478f)
        curveTo(7.48915f, 9.89983f, 7.93842f, 9.61101f, 8.83697f, 9.03338f)
        lineTo(10.9185f, 7.69526f)
        curveTo(11.4437f, 7.35763f, 11.7063f, 7.18881f, 12f, 7.18881f)
        curveTo(12.2937f, 7.18881f, 12.5563f, 7.35763f, 13.0815f, 7.69526f)
        lineTo(15.163f, 9.03338f)
        curveTo(16.0616f, 9.61101f, 16.5108f, 9.89983f, 16.7554f, 10.3478f)
        curveTo(17f, 10.7958f, 17f, 11.3299f, 17f, 12.3981f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13f)
        horizontalLineTo(12.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 22f)
        verticalLineTo(16.1623f)
        curveTo(21f, 13.8707f, 19.7408f, 13.6852f, 17f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        verticalLineTo(16.1623f)
        curveTo(3f, 13.8707f, 4.25916f, 13.6852f, 7f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(4.98221f)
        moveTo(12f, 4.98221f)
        verticalLineTo(2.97035f)
        curveTo(12f, 2.49615f, 12f, 2.25905f, 12.1464f, 2.11173f)
        curveTo(12.6061f, 1.64939f, 14.5f, 2.74303f, 15.2203f, 3.18653f)
        curveTo(15.8285f, 3.56105f, 16f, 4.30914f, 16f, 4.98221f)
        horizontalLineTo(12f)
        }
        }.build()

        return _school!!
    }

private var _school: ImageVector? = null
