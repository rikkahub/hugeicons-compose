package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SpoonAndFork: ImageVector
    get() {
        if (_spoonAndFork != null) {
            return _spoonAndFork!!
        }
        _spoonAndFork = ImageVector.Builder(
            name = "SpoonAndFork",
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
        moveTo(18.4998f, 3.00195f)
        lineTo(15.0604f, 6.44129f)
        curveTo(14.4746f, 7.02708f, 14.4746f, 7.97683f, 15.0604f, 8.56261f)
        lineTo(15.7498f, 9.25195f)
        moveTo(21.9998f, 6.50195f)
        lineTo(18.5604f, 9.94129f)
        curveTo(17.9746f, 10.5271f, 17.0249f, 10.5271f, 16.4391f, 9.94129f)
        lineTo(15.7498f, 9.25195f)
        moveTo(15.7498f, 9.25195f)
        lineTo(3.99976f, 21.002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 4.99902f)
        lineTo(17.5f, 7.49902f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.98914f, 8.99011f)
        curveTo(6.79472f, 10.1845f, 5.15674f, 10.4831f, 3.66377f, 8.99011f)
        curveTo(2.17075f, 7.49709f, 1.38801f, 4.77783f, 2.58243f, 3.58341f)
        curveTo(3.77685f, 2.38899f, 6.49611f, 3.17172f, 7.98914f, 4.66475f)
        curveTo(9.48211f, 6.15772f, 9.18356f, 7.79569f, 7.98914f, 8.99011f)
        moveTo(7.98914f, 8.99011f)
        lineTo(20f, 21.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.20542f, 2.39669f)
        curveTo(10.0923f, 2.13908f, 11.03f, 2.00098f, 12f, 2.00098f)
        curveTo(13.1517f, 2.00098f, 14.2579f, 2.19567f, 15.2876f, 2.55394f)
        moveTo(2.04937f, 11.001f)
        curveTo(2.01672f, 11.3299f, 2f, 11.6635f, 2f, 12.001f)
        curveTo(2f, 14.0328f, 2.60598f, 15.9231f, 3.64707f, 17.501f)
        moveTo(7.77267f, 21.0661f)
        curveTo(9.05671f, 21.6659f, 10.4892f, 22.001f, 12f, 22.001f)
        curveTo(13.5244f, 22.001f, 14.9691f, 21.6599f, 16.262f, 21.0499f)
        moveTo(20.3529f, 17.501f)
        curveTo(21.394f, 15.9231f, 22f, 14.0328f, 22f, 12.001f)
        curveTo(22f, 11.4228f, 21.9509f, 10.8561f, 21.8567f, 10.3048f)
        }
        }.build()

        return _spoonAndFork!!
    }

private var _spoonAndFork: ImageVector? = null
