package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wallet05: ImageVector
    get() {
        if (_wallet05 != null) {
            return _wallet05!!
        }
        _wallet05 = ImageVector.Builder(
            name = "Wallet05",
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
        moveTo(2f, 12f)
        curveTo(2f, 8.22876f, 2f, 6.34315f, 3.17157f, 5.17157f)
        curveTo(4.34315f, 4f, 6.22876f, 4f, 10f, 4f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 4f, 19.6569f, 4f, 20.8284f, 5.17157f)
        curveTo(22f, 6.34315f, 22f, 8.22876f, 22f, 12f)
        curveTo(22f, 15.7712f, 22f, 17.6569f, 20.8284f, 18.8284f)
        curveTo(19.6569f, 20f, 17.7712f, 20f, 14f, 20f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 20f, 4.34315f, 20f, 3.17157f, 18.8284f)
        curveTo(2f, 17.6569f, 2f, 15.7712f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 10f)
        horizontalLineTo(6.19722f)
        curveTo(6.91179f, 10f, 7.26908f, 10f, 7.58952f, 10.112f)
        curveTo(7.7852f, 10.1804f, 7.96906f, 10.2788f, 8.13451f, 10.4037f)
        curveTo(8.40544f, 10.6082f, 8.60363f, 10.9054f, 9f, 11.5f)
        curveTo(9.39637f, 12.0946f, 9.59456f, 12.3918f, 9.86549f, 12.5963f)
        curveTo(10.0309f, 12.7212f, 10.2148f, 12.8196f, 10.4105f, 12.888f)
        curveTo(10.7309f, 13f, 11.0882f, 13f, 11.8028f, 13f)
        horizontalLineTo(12.1972f)
        curveTo(12.9118f, 13f, 13.2691f, 13f, 13.5895f, 12.888f)
        curveTo(13.7852f, 12.8196f, 13.9691f, 12.7212f, 14.1345f, 12.5963f)
        curveTo(14.4054f, 12.3918f, 14.6036f, 12.0946f, 15f, 11.5f)
        curveTo(15.3964f, 10.9054f, 15.5946f, 10.6082f, 15.8655f, 10.4037f)
        curveTo(16.0309f, 10.2788f, 16.2148f, 10.1804f, 16.4105f, 10.112f)
        curveTo(16.7309f, 10f, 17.0882f, 10f, 17.8028f, 10f)
        horizontalLineTo(22f)
        }
        }.build()

        return _wallet05!!
    }

private var _wallet05: ImageVector? = null
