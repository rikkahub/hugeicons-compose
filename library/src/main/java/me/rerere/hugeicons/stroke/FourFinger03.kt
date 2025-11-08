package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FourFinger03: ImageVector
    get() {
        if (_fourFinger03 != null) {
            return _fourFinger03!!
        }
        _fourFinger03 = ImageVector.Builder(
            name = "FourFinger03",
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
        moveTo(7.89205f, 9.35707f)
        lineTo(5.4741f, 11.9595f)
        curveTo(5.15171f, 12.2914f, 4.57635f, 13.1576f, 4.50692f, 13.951f)
        curveTo(4.4339f, 14.7853f, 5.18562f, 15.9822f, 5.4741f, 16.4404f)
        curveTo(6.22604f, 17.6346f, 6.52881f, 18.2973f, 7.40846f, 19.4276f)
        curveTo(7.88617f, 20.0414f, 9.17658f, 21.2649f, 11.2772f, 21.4191f)
        curveTo(12.8453f, 21.5341f, 14.4062f, 21.5234f, 15.1459f, 21.4191f)
        curveTo(15.6538f, 21.3474f, 16.8868f, 21.1203f, 18.0474f, 19.9254f)
        curveTo(19.2081f, 18.7306f, 19.4982f, 16.7723f, 19.4982f, 15.9425f)
        verticalLineTo(7.97657f)
        curveTo(19.4982f, 7.4787f, 19.2081f, 6.48296f, 18.0474f, 6.48296f)
        curveTo(16.8868f, 6.48296f, 16.5967f, 7.4787f, 16.5967f, 7.97657f)
        verticalLineTo(11.4617f)
        moveTo(7.89205f, 13.951f)
        verticalLineTo(5.98509f)
        curveTo(7.89205f, 5.48722f, 8.1822f, 4.49148f, 9.34282f, 4.49148f)
        curveTo(10.5034f, 4.49148f, 10.7936f, 5.48722f, 10.7936f, 5.98509f)
        moveTo(10.7936f, 5.98509f)
        verticalLineTo(10.4659f)
        moveTo(10.7936f, 5.98509f)
        verticalLineTo(3.99361f)
        curveTo(10.7936f, 3.49574f, 11.0837f, 2.5f, 12.2444f, 2.5f)
        curveTo(13.405f, 2.5f, 13.6951f, 3.49574f, 13.6951f, 3.99361f)
        verticalLineTo(5.98509f)
        moveTo(13.6951f, 5.98509f)
        verticalLineTo(10.4659f)
        moveTo(13.6951f, 5.98509f)
        curveTo(13.6951f, 5.48722f, 13.9853f, 4.49148f, 15.1459f, 4.49148f)
        curveTo(16.3065f, 4.49148f, 16.5967f, 5.48722f, 16.5967f, 5.98509f)
        verticalLineTo(8.47444f)
        }
        }.build()

        return _fourFinger03!!
    }

private var _fourFinger03: ImageVector? = null
