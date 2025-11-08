package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cos: ImageVector
    get() {
        if (_cos != null) {
            return _cos!!
        }
        _cos = ImageVector.Builder(
            name = "Cos",
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
        moveTo(9.5f, 9.5f)
        curveTo(9.5f, 8.11929f, 10.6193f, 7f, 12f, 7f)
        curveTo(13.3807f, 7f, 14.5f, 8.11929f, 14.5f, 9.5f)
        verticalLineTo(14.5f)
        curveTo(14.5f, 15.8807f, 13.3807f, 17f, 12f, 17f)
        curveTo(10.6193f, 17f, 9.5f, 15.8807f, 9.5f, 14.5f)
        verticalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.6896f, 8.61565f)
        curveTo(21.2637f, 7.65235f, 20.4428f, 7f, 19.5f, 7f)
        horizontalLineTo(19f)
        curveTo(17.8954f, 7f, 17f, 8.11929f, 17f, 9.5f)
        curveTo(17f, 10.8807f, 17.8954f, 12f, 19f, 12f)
        horizontalLineTo(20f)
        curveTo(21.1046f, 12f, 22f, 13.1193f, 22f, 14.5f)
        curveTo(22f, 15.8807f, 21.1046f, 17f, 20f, 17f)
        horizontalLineTo(19.5f)
        curveTo(18.4748f, 17f, 17.5938f, 16.2287f, 17.208f, 15.125f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8.31432f)
        curveTo(6.55082f, 7.53174f, 5.67081f, 7f, 4.65873f, 7f)
        curveTo(3.19035f, 7f, 2f, 8.11929f, 2f, 9.5f)
        verticalLineTo(14.5f)
        curveTo(2f, 15.8807f, 3.19035f, 17f, 4.65873f, 17f)
        curveTo(5.67081f, 17f, 6.55082f, 16.4683f, 7f, 15.6857f)
        }
        }.build()

        return _cos!!
    }

private var _cos: ImageVector? = null
