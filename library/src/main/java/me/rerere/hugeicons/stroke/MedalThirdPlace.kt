package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MedalThirdPlace: ImageVector
    get() {
        if (_medalThirdPlace != null) {
            return _medalThirdPlace!!
        }
        _medalThirdPlace = ImageVector.Builder(
            name = "MedalThirdPlace",
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
        moveTo(10.5f, 14f)
        curveTo(10.8265f, 13.347f, 11.2786f, 13f, 12f, 13f)
        curveTo(12.7296f, 13f, 13.5f, 13.4558f, 13.5f, 14.25f)
        curveTo(13.5f, 14.9404f, 12.9404f, 15.5f, 12.25f, 15.5f)
        curveTo(12.9404f, 15.5f, 13.5f, 16.0596f, 13.5f, 16.75f)
        curveTo(13.5f, 17.5442f, 12.7296f, 18f, 12f, 18f)
        curveTo(11.2786f, 18f, 10.8265f, 17.653f, 10.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 9.5f)
        lineTo(5.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9.5f)
        lineTo(18.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 2f)
        lineTo(14f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 9f)
        lineTo(9.5f, 2f)
        }
        }.build()

        return _medalThirdPlace!!
    }

private var _medalThirdPlace: ImageVector? = null
