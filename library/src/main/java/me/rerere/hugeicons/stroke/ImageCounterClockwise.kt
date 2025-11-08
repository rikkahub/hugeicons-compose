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
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 7.5f)
        horizontalLineTo(8.4f)
        curveTo(5.38301f, 7.5f, 3.87452f, 7.5f, 2.93726f, 8.41122f)
        curveTo(2f, 9.32245f, 2f, 10.789f, 2f, 13.7222f)
        verticalLineTo(15.2778f)
        curveTo(2f, 18.211f, 2f, 19.6776f, 2.93726f, 20.5888f)
        curveTo(3.87452f, 21.5f, 5.38301f, 21.5f, 8.4f, 21.5f)
        horizontalLineTo(11.6f)
        curveTo(14.617f, 21.5f, 16.1255f, 21.5f, 17.0627f, 20.5888f)
        curveTo(18f, 19.6776f, 18f, 18.211f, 18f, 15.2778f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 17.7857f)
        lineTo(13.4327f, 13.7712f)
        curveTo(13.2576f, 13.5984f, 13.0104f, 13.5f, 12.7513f, 13.5f)
        curveTo(12.5061f, 13.5f, 12.271f, 13.5881f, 12.0977f, 13.7449f)
        lineTo(8.42105f, 17.0714f)
        lineTo(6.71522f, 15.5281f)
        curveTo(6.54372f, 15.3729f, 6.31111f, 15.2857f, 6.06857f, 15.2857f)
        curveTo(5.80735f, 15.2857f, 5.5586f, 15.3868f, 5.38506f, 15.5634f)
        lineTo(2.5f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 7.5f)
        curveTo(13.9122f, 6.28555f, 15.3645f, 5.5f, 17.0004f, 5.5f)
        curveTo(19.7618f, 5.5f, 22.0004f, 7.73858f, 22.0004f, 10.5f)
        curveTo(22.0004f, 11.6258f, 21.6283f, 12.6647f, 21.0004f, 13.5005f)
        moveTo(13f, 7.5f)
        lineTo(14.0004f, 3.5f)
        moveTo(13f, 7.5f)
        lineTo(16.5004f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.49f, 11.99f)
        verticalLineTo(12f)
        }
        }.build()

        return _imageCounterClockwise!!
    }

private var _imageCounterClockwise: ImageVector? = null
