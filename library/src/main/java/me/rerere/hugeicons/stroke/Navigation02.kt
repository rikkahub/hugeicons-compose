package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Navigation02: ImageVector
    get() {
        if (_navigation02 != null) {
            return _navigation02!!
        }
        _navigation02 = ImageVector.Builder(
            name = "Navigation02",
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
        moveTo(2.00017f, 11.9496f)
        curveTo(1.96943f, 12.9853f, 6.03156f, 15.4206f, 6.41417f, 14.9373f)
        curveTo(7.15382f, 13.8962f, 7.21955f, 10.1078f, 6.45955f, 9.06478f)
        curveTo(6.10401f, 8.58035f, 2.03018f, 10.9389f, 2.00017f, 11.9496f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9496f, 21.9997f)
        curveTo(12.9853f, 22.0304f, 15.4206f, 17.9683f, 14.9373f, 17.5857f)
        curveTo(13.8962f, 16.8461f, 10.1078f, 16.7803f, 9.06478f, 17.5403f)
        curveTo(8.58035f, 17.8959f, 10.9389f, 21.9697f, 11.9496f, 21.9997f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9998f, 11.9496f)
        curveTo(22.0306f, 12.9853f, 17.9684f, 15.4207f, 17.5858f, 14.9373f)
        curveTo(16.8462f, 13.8962f, 16.7805f, 10.1079f, 17.5404f, 9.06484f)
        curveTo(17.896f, 8.58041f, 21.9698f, 10.9389f, 21.9998f, 11.9496f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9496f, 2.00005f)
        curveTo(12.9853f, 1.96931f, 15.4206f, 6.03144f, 14.9373f, 6.41404f)
        curveTo(13.8962f, 7.1537f, 10.1078f, 7.21943f, 9.06478f, 6.45943f)
        curveTo(8.58035f, 6.10389f, 10.9389f, 2.03006f, 11.9496f, 2.00005f)
        }
        }.build()

        return _navigation02!!
    }

private var _navigation02: ImageVector? = null
