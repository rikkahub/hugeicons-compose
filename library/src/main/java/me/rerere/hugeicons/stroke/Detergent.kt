package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Detergent: ImageVector
    get() {
        if (_detergent != null) {
            return _detergent!!
        }
        _detergent = ImageVector.Builder(
            name = "Detergent",
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
        moveTo(12.5f, 4.5f)
        horizontalLineTo(8.5f)
        verticalLineTo(4f)
        curveTo(8.5f, 3.05719f, 8.5f, 2.58579f, 8.79289f, 2.29289f)
        curveTo(9.08579f, 2f, 9.55719f, 2f, 10.5f, 2f)
        curveTo(11.4428f, 2f, 11.9142f, 2f, 12.2071f, 2.29289f)
        curveTo(12.5f, 2.58579f, 12.5f, 3.05719f, 12.5f, 4f)
        verticalLineTo(4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 18f)
        verticalLineTo(10.5227f)
        curveTo(18f, 7.39489f, 15.6149f, 4.78318f, 12.5f, 4.5f)
        horizontalLineTo(8.5f)
        curveTo(8.5f, 4.56544f, 8.5f, 4.59817f, 8.49959f, 4.63031f)
        curveTo(8.4881f, 5.52366f, 8.23745f, 6.39762f, 7.77372f, 7.16128f)
        curveTo(7.75703f, 7.18875f, 7.73968f, 7.2165f, 7.705f, 7.272f)
        lineTo(7.36364f, 7.81818f)
        curveTo(6.91572f, 8.53486f, 6.69175f, 8.8932f, 6.52218f, 9.27262f)
        curveTo(6.29168f, 9.78836f, 6.13518f, 10.3341f, 6.0573f, 10.8936f)
        curveTo(6f, 11.3052f, 6f, 11.7278f, 6f, 12.5729f)
        verticalLineTo(18f)
        curveTo(6f, 19.8856f, 6f, 20.8284f, 6.58579f, 21.4142f)
        curveTo(7.17157f, 22f, 8.11438f, 22f, 10f, 22f)
        horizontalLineTo(14f)
        curveTo(15.8856f, 22f, 16.8284f, 22f, 17.4142f, 21.4142f)
        curveTo(18f, 20.8284f, 18f, 19.8856f, 18f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.011f, 8.51372f)
        curveTo(15.6812f, 9.68758f, 15.6598f, 10.9688f, 14.9634f, 11.3755f)
        curveTo(14.267f, 11.7821f, 13.1591f, 11.1602f, 12.489f, 9.98628f)
        curveTo(11.8188f, 8.81242f, 11.8402f, 7.53117f, 12.5366f, 7.12453f)
        curveTo(13.233f, 6.71789f, 14.3409f, 7.33985f, 15.011f, 8.51372f)
        }
        }.build()

        return _detergent!!
    }

private var _detergent: ImageVector? = null
