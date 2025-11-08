package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Treadmill01: ImageVector
    get() {
        if (_treadmill01 != null) {
            return _treadmill01!!
        }
        _treadmill01 = ImageVector.Builder(
            name = "Treadmill01",
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
        moveTo(20.1913f, 21f)
        horizontalLineTo(2.93168f)
        curveTo(2.35308f, 21f, 2.03614f, 20.5214f, 2.00291f, 20.0152f)
        curveTo(1.97055f, 19.5222f, 2.20738f, 19.003f, 2.7338f, 18.8747f)
        lineTo(17.9482f, 15.106f)
        curveTo(22.205f, 14.0681f, 23.3638f, 21f, 20.1913f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 18f)
        horizontalLineTo(19.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 2f)
        curveTo(21.6994f, 2.90192f, 21.5175f, 4.14866f, 20.8331f, 4.83307f)
        curveTo(20.4992f, 5.16693f, 20.0337f, 5.3221f, 19.1026f, 5.63246f)
        lineTo(15f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 16f)
        lineTo(20f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 21f)
        lineTo(5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 21f)
        verticalLineTo(22f)
        }
        }.build()

        return _treadmill01!!
    }

private var _treadmill01: ImageVector? = null
