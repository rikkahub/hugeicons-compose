package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiBrowser: ImageVector
    get() {
        if (_aiBrowser != null) {
            return _aiBrowser!!
        }
        _aiBrowser = ImageVector.Builder(
            name = "AiBrowser",
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
        moveTo(20.9977f, 13f)
        curveTo(21f, 12.5299f, 21f, 12.0307f, 21f, 11.5f)
        curveTo(21f, 7.02166f, 21f, 4.78249f, 19.6088f, 3.39124f)
        curveTo(18.2175f, 2f, 15.9783f, 2f, 11.5f, 2f)
        curveTo(7.02166f, 2f, 4.78249f, 2f, 3.39124f, 3.39124f)
        curveTo(2f, 4.78249f, 2f, 7.02166f, 2f, 11.5f)
        curveTo(2f, 15.9783f, 2f, 18.2175f, 3.39124f, 19.6088f)
        curveTo(4.78249f, 21f, 7.02166f, 21f, 11.5f, 21f)
        curveTo(12.0307f, 21f, 12.5299f, 21f, 13f, 20.9977f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 15f)
        lineTo(18.7579f, 15.697f)
        curveTo(19.0961f, 16.611f, 19.2652f, 17.068f, 19.5986f, 17.4014f)
        curveTo(19.932f, 17.7348f, 20.389f, 17.9039f, 21.303f, 18.2421f)
        lineTo(22f, 18.5f)
        lineTo(21.303f, 18.7579f)
        curveTo(20.389f, 19.0961f, 19.932f, 19.2652f, 19.5986f, 19.5986f)
        curveTo(19.2652f, 19.932f, 19.0961f, 20.389f, 18.7579f, 21.303f)
        lineTo(18.5f, 22f)
        lineTo(18.2421f, 21.303f)
        curveTo(17.9039f, 20.389f, 17.7348f, 19.932f, 17.4014f, 19.5986f)
        curveTo(17.068f, 19.2652f, 16.611f, 19.0961f, 15.697f, 18.7579f)
        lineTo(15f, 18.5f)
        lineTo(15.697f, 18.2421f)
        curveTo(16.611f, 17.9039f, 17.068f, 17.7348f, 17.4014f, 17.4014f)
        curveTo(17.7348f, 17.068f, 17.9039f, 16.611f, 18.2421f, 15.697f)
        lineTo(18.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.49981f, 5.5f)
        horizontalLineTo(6.50879f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4998f, 5.5f)
        horizontalLineTo(10.5088f)
        }
        }.build()

        return _aiBrowser!!
    }

private var _aiBrowser: ImageVector? = null
