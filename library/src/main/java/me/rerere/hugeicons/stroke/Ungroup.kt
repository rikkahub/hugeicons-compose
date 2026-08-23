package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ungroup: ImageVector
    get() {
        if (_ungroup != null) {
            return _ungroup!!
        }
        _ungroup = ImageVector.Builder(
            name = "Ungroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.5f, 10f)
            horizontalLineTo(7.5f)
            curveTo(6.56936f, 10f, 6.10404f, 10f, 5.72746f, 9.87764f)
            curveTo(4.96636f, 9.63035f, 4.36965f, 9.03364f, 4.12236f, 8.27254f)
            curveTo(4f, 7.89596f, 4f, 7.43064f, 4f, 6.5f)
            curveTo(4f, 5.56936f, 4f, 5.10404f, 4.12236f, 4.72746f)
            curveTo(4.36965f, 3.96636f, 4.96636f, 3.36965f, 5.72746f, 3.12236f)
            curveTo(6.10404f, 3f, 6.56936f, 3f, 7.5f, 3f)
            horizontalLineTo(10.5f)
            curveTo(11.4306f, 3f, 11.896f, 3f, 12.2725f, 3.12236f)
            curveTo(13.0336f, 3.36965f, 13.6303f, 3.96636f, 13.8776f, 4.72746f)
            curveTo(14f, 5.10404f, 14f, 5.56936f, 14f, 6.5f)
            curveTo(14f, 7.43064f, 14f, 7.89596f, 13.8776f, 8.27254f)
            curveTo(13.6303f, 9.03364f, 13.0336f, 9.63035f, 12.2725f, 9.87764f)
            curveTo(11.896f, 10f, 11.4306f, 10f, 10.5f, 10f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.5f, 21f)
            horizontalLineTo(13.5f)
            curveTo(12.5694f, 21f, 12.104f, 21f, 11.7275f, 20.8776f)
            curveTo(10.9664f, 20.6303f, 10.3697f, 20.0336f, 10.1224f, 19.2725f)
            curveTo(10f, 18.896f, 10f, 18.4306f, 10f, 17.5f)
            curveTo(10f, 16.5694f, 10f, 16.104f, 10.1224f, 15.7275f)
            curveTo(10.3697f, 14.9664f, 10.9664f, 14.3697f, 11.7275f, 14.1224f)
            curveTo(12.104f, 14f, 12.5694f, 14f, 13.5f, 14f)
            horizontalLineTo(16.5f)
            curveTo(17.4306f, 14f, 17.896f, 14f, 18.2725f, 14.1224f)
            curveTo(19.0336f, 14.3697f, 19.6303f, 14.9664f, 19.8776f, 15.7275f)
            curveTo(20f, 16.104f, 20f, 16.5694f, 20f, 17.5f)
            curveTo(20f, 18.4306f, 20f, 18.896f, 19.8776f, 19.2725f)
            curveTo(19.6303f, 20.0336f, 19.0336f, 20.6303f, 18.2725f, 20.8776f)
            curveTo(17.896f, 21f, 17.4306f, 21f, 16.5f, 21f)
            close()
        }
        }.build()

        return _ungroup!!
    }

private var _ungroup: ImageVector? = null
