package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageCounterClockwise: ImageVector
    get() {
        if (_imageCounterClockwise != null) {
            return _imageCounterClockwise!!
        }
        _imageCounterClockwise = ImageVector.Builder(
            name = "ImageCounterClockwise",
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
        moveTo(10f, 7f)
        horizontalLineTo(8.4f)
        curveTo(5.38301f, 7f, 3.87452f, 7f, 2.93726f, 7.91122f)
        curveTo(2f, 8.82245f, 2f, 10.289f, 2f, 13.2222f)
        verticalLineTo(14.7778f)
        curveTo(2f, 17.711f, 2f, 19.1776f, 2.93726f, 20.0888f)
        curveTo(3.87452f, 21f, 5.38301f, 21f, 8.4f, 21f)
        horizontalLineTo(11.6f)
        curveTo(14.617f, 21f, 16.1255f, 21f, 17.0627f, 20.0888f)
        curveTo(18f, 19.1776f, 18f, 17.711f, 18f, 14.7778f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 17.2857f)
        lineTo(13.4327f, 13.2712f)
        curveTo(13.2576f, 13.0984f, 13.0104f, 13f, 12.7513f, 13f)
        curveTo(12.5061f, 13f, 12.271f, 13.0881f, 12.0977f, 13.2449f)
        lineTo(8.42105f, 16.5714f)
        lineTo(6.71522f, 15.0281f)
        curveTo(6.54372f, 14.8729f, 6.31111f, 14.7857f, 6.06857f, 14.7857f)
        curveTo(5.80735f, 14.7857f, 5.5586f, 14.8868f, 5.38506f, 15.0634f)
        lineTo(2.5f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 7f)
        curveTo(13.9122f, 5.78555f, 15.3645f, 5f, 17.0004f, 5f)
        curveTo(19.7618f, 5f, 22.0004f, 7.23858f, 22.0004f, 10f)
        curveTo(22.0004f, 11.1258f, 21.6283f, 12.1647f, 21.0004f, 13.0005f)
        moveTo(13f, 7f)
        lineTo(14.0004f, 3f)
        moveTo(13f, 7f)
        lineTo(16.5004f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.49f, 11.49f)
        verticalLineTo(11.5f)
        }
        }.build()

        return _imageCounterClockwise!!
    }

private var _imageCounterClockwise: ImageVector? = null
