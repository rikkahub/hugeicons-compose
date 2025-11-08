package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Pavilon: ImageVector
    get() {
        if (_pavilon != null) {
            return _pavilon!!
        }
        _pavilon = ImageVector.Builder(
            name = "Pavilon",
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
        moveTo(6f, 11.3338f)
        verticalLineTo(21.5f)
        moveTo(18f, 11.3361f)
        verticalLineTo(21.5f)
        moveTo(9.5f, 21.5f)
        lineTo(10.0065f, 18.4592f)
        curveTo(10.1261f, 17.741f, 10.1859f, 17.3819f, 10.3463f, 17.1165f)
        curveTo(10.7446f, 16.4571f, 11.3843f, 16.4969f, 12f, 16.4969f)
        curveTo(12.6157f, 16.4969f, 13.2554f, 16.4571f, 13.6537f, 17.1165f)
        curveTo(13.8141f, 17.3819f, 13.8739f, 17.741f, 13.9935f, 18.4592f)
        lineTo(14.5f, 21.5f)
        moveTo(3f, 21.5f)
        horizontalLineTo(21f)
        moveTo(7.12038f, 11.4811f)
        curveTo(5.81567f, 11.4811f, 3.90987f, 10.864f, 3.03476f, 8.51048f)
        curveTo(5.33669f, 8.37831f, 10.2316f, 7.831f, 12.0044f, 2.5f)
        curveTo(13.8535f, 7.91432f, 18.672f, 8.37831f, 20.9739f, 8.51048f)
        curveTo(20.0988f, 10.864f, 18.193f, 11.4811f, 16.8883f, 11.4811f)
        horizontalLineTo(7.12038f)
        }
        }.build()

        return _pavilon!!
    }

private var _pavilon: ImageVector? = null
