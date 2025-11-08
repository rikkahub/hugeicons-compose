package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Monas: ImageVector
    get() {
        if (_monas != null) {
            return _monas!!
        }
        _monas = ImageVector.Builder(
            name = "Monas",
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
        moveTo(13f, 7f)
        curveTo(13.5f, 6.5f, 14f, 5.61496f, 14f, 5f)
        curveTo(14f, 3.61929f, 12f, 2f, 12f, 2f)
        curveTo(12f, 2f, 10f, 3.61929f, 10f, 5f)
        curveTo(10f, 5.61496f, 10.5f, 6.5f, 11f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 7f)
        horizontalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 7f)
        lineTo(9f, 17f)
        moveTo(13f, 7f)
        lineTo(15f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.42153f, 20.1014f)
        curveTo(6.75257f, 18.7451f, 5.65909f, 17.3295f, 5f, 17f)
        horizontalLineTo(19f)
        curveTo(18.3409f, 17.3295f, 17.2474f, 18.7451f, 16.5785f, 20.1014f)
        curveTo(16.0533f, 21.1661f, 15.7908f, 21.6984f, 15.5483f, 21.8492f)
        curveTo(15.3058f, 22f, 14.8705f, 22f, 14f, 22f)
        horizontalLineTo(10f)
        curveTo(9.12949f, 22f, 8.69423f, 22f, 8.45174f, 21.8492f)
        curveTo(8.20925f, 21.6984f, 7.94667f, 21.1661f, 7.42153f, 20.1014f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        verticalLineTo(20f)
        }
        }.build()

        return _monas!!
    }

private var _monas: ImageVector? = null
