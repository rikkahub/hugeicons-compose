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
        moveTo(14f, 7.5f)
        horizontalLineTo(15.6f)
        curveTo(18.617f, 7.5f, 20.1255f, 7.5f, 21.0627f, 8.41122f)
        curveTo(22f, 9.32245f, 22f, 10.789f, 22f, 13.7222f)
        verticalLineTo(15.2778f)
        curveTo(22f, 18.211f, 22f, 19.6776f, 21.0627f, 20.5888f)
        curveTo(20.1255f, 21.5f, 18.617f, 21.5f, 15.6f, 21.5f)
        horizontalLineTo(12.4f)
        curveTo(9.38301f, 21.5f, 7.87452f, 21.5f, 6.93726f, 20.5888f)
        curveTo(6f, 19.6776f, 6f, 18.211f, 6f, 15.2778f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 17.7857f)
        lineTo(17.4327f, 13.7712f)
        curveTo(17.2576f, 13.5984f, 17.0104f, 13.5f, 16.7513f, 13.5f)
        curveTo(16.5061f, 13.5f, 16.271f, 13.5881f, 16.0977f, 13.7449f)
        lineTo(12.4211f, 17.0714f)
        lineTo(10.7152f, 15.5281f)
        curveTo(10.5437f, 15.3729f, 10.3111f, 15.2857f, 10.0686f, 15.2857f)
        curveTo(9.80735f, 15.2857f, 9.5586f, 15.3868f, 9.38506f, 15.5634f)
        lineTo(6.5f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0004f, 7.5f)
        curveTo(10.0882f, 6.28555f, 8.63582f, 5.5f, 7f, 5.5f)
        curveTo(4.23858f, 5.5f, 2f, 7.73858f, 2f, 10.5f)
        curveTo(2f, 11.6258f, 2.37209f, 12.6647f, 3f, 13.5005f)
        moveTo(11.0004f, 7.5f)
        lineTo(10f, 3.5f)
        moveTo(11.0004f, 7.5f)
        lineTo(7.5f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.49f, 11.99f)
        verticalLineTo(12f)
        }
        }.build()

        return _imageRotationClockwise!!
    }

private var _imageRotationClockwise: ImageVector? = null
