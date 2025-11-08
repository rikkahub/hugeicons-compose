package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserEdit01: ImageVector
    get() {
        if (_userEdit01 != null) {
            return _userEdit01!!
        }
        _userEdit01 = ImageVector.Builder(
            name = "UserEdit01",
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
        moveTo(15.5f, 8f)
        curveTo(15.5f, 5.23858f, 13.2614f, 3f, 10.5f, 3f)
        curveTo(7.73858f, 3f, 5.5f, 5.23858f, 5.5f, 8f)
        curveTo(5.5f, 10.7614f, 7.73858f, 13f, 10.5f, 13f)
        curveTo(13.2614f, 13f, 15.5f, 10.7614f, 15.5f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 20f)
        curveTo(3.5f, 16.134f, 6.63401f, 13f, 10.5f, 13f)
        curveTo(11.775f, 13f, 12.9704f, 13.3409f, 14f, 13.9365f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.1887f, 14.9339f)
        lineTo(19.5661f, 14.3113f)
        curveTo(19.151f, 13.8962f, 18.478f, 13.8962f, 18.0629f, 14.3113f)
        lineTo(14.7141f, 17.6601f)
        curveTo(14.269f, 18.1052f, 13.9656f, 18.6722f, 13.8421f, 19.2895f)
        lineTo(13.5f, 21f)
        lineTo(15.2105f, 20.6579f)
        curveTo(15.8278f, 20.5344f, 16.3948f, 20.231f, 16.8399f, 19.7859f)
        lineTo(20.1887f, 16.4371f)
        curveTo(20.6038f, 16.022f, 20.6038f, 15.349f, 20.1887f, 14.9339f)
        }
        }.build()

        return _userEdit01!!
    }

private var _userEdit01: ImageVector? = null
