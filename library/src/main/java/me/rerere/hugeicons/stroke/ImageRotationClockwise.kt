package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageRotationClockwise: ImageVector
    get() {
        if (_imageRotationClockwise != null) {
            return _imageRotationClockwise!!
        }
        _imageRotationClockwise = ImageVector.Builder(
            name = "ImageRotationClockwise",
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
        moveTo(14f, 7f)
        horizontalLineTo(15.6f)
        curveTo(18.617f, 7f, 20.1255f, 7f, 21.0627f, 7.91122f)
        curveTo(22f, 8.82245f, 22f, 10.289f, 22f, 13.2222f)
        verticalLineTo(14.7778f)
        curveTo(22f, 17.711f, 22f, 19.1776f, 21.0627f, 20.0888f)
        curveTo(20.1255f, 21f, 18.617f, 21f, 15.6f, 21f)
        horizontalLineTo(12.4f)
        curveTo(9.38301f, 21f, 7.87452f, 21f, 6.93726f, 20.0888f)
        curveTo(6f, 19.1776f, 6f, 17.711f, 6f, 14.7778f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 17.2857f)
        lineTo(17.4327f, 13.2712f)
        curveTo(17.2576f, 13.0984f, 17.0104f, 13f, 16.7513f, 13f)
        curveTo(16.5061f, 13f, 16.271f, 13.0881f, 16.0977f, 13.2449f)
        lineTo(12.4211f, 16.5714f)
        lineTo(10.7152f, 15.0281f)
        curveTo(10.5437f, 14.8729f, 10.3111f, 14.7857f, 10.0686f, 14.7857f)
        curveTo(9.80735f, 14.7857f, 9.5586f, 14.8868f, 9.38506f, 15.0634f)
        lineTo(6.5f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0004f, 7f)
        curveTo(10.0882f, 5.78555f, 8.63582f, 5f, 7f, 5f)
        curveTo(4.23858f, 5f, 2f, 7.23858f, 2f, 10f)
        curveTo(2f, 11.1258f, 2.37209f, 12.1647f, 3f, 13.0005f)
        moveTo(11.0004f, 7f)
        lineTo(10f, 3f)
        moveTo(11.0004f, 7f)
        lineTo(7.5f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.49f, 11.49f)
        verticalLineTo(11.5f)
        }
        }.build()

        return _imageRotationClockwise!!
    }

private var _imageRotationClockwise: ImageVector? = null
