package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = ImageVector.Builder(
            name = "Garage",
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
        moveTo(9.7812f, 3.09766f)
        lineTo(5.6718f, 5.89369f)
        curveTo(4.3639f, 6.78359f, 3.70995f, 7.22854f, 3.35498f, 7.90548f)
        curveTo(3f, 8.58242f, 3f, 9.38456f, 3f, 10.9888f)
        verticalLineTo(17.9176f)
        curveTo(3f, 19.8421f, 3f, 20.8043f, 3.58579f, 21.4021f)
        curveTo(4.17157f, 22f, 5.11438f, 22f, 7f, 22f)
        horizontalLineTo(17f)
        curveTo(18.8856f, 22f, 19.8284f, 22f, 20.4142f, 21.4021f)
        curveTo(21f, 20.8043f, 21f, 19.8421f, 21f, 17.9176f)
        verticalLineTo(10.9888f)
        curveTo(21f, 9.38456f, 21f, 8.58242f, 20.645f, 7.90548f)
        curveTo(20.29f, 7.22854f, 19.6361f, 6.78359f, 18.3282f, 5.89369f)
        lineTo(14.2188f, 3.09766f)
        curveTo(13.1433f, 2.36589f, 12.6056f, 2f, 12f, 2f)
        curveTo(11.3944f, 2f, 10.8567f, 2.36589f, 9.7812f, 3.09766f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        verticalLineTo(15f)
        curveTo(7f, 13.1144f, 7f, 12.1716f, 7.58579f, 11.5858f)
        curveTo(8.17157f, 11f, 9.11438f, 11f, 11f, 11f)
        horizontalLineTo(13f)
        curveTo(14.8856f, 11f, 15.8284f, 11f, 16.4142f, 11.5858f)
        curveTo(17f, 12.1716f, 17f, 13.1144f, 17f, 15f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 14f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 18f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.008f, 7f)
        lineTo(11.999f, 7f)
        }
        }.build()

        return _garage!!
    }

private var _garage: ImageVector? = null
